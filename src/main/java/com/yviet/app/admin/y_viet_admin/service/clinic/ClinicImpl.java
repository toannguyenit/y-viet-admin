package com.yviet.app.admin.y_viet_admin.service.clinic;

import com.yviet.app.admin.y_viet_admin.dto.request.clinic.ClinicCreateRequest;
import com.yviet.app.admin.y_viet_admin.dto.response.clinic.ClinicGetResponse;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicDetailEntity;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicEntity;
import com.yviet.app.admin.y_viet_admin.exception.AppException;
import com.yviet.app.admin.y_viet_admin.exception.ErrorCode;
import com.yviet.app.admin.y_viet_admin.mapper.clinic.ClinicMapper;
import com.yviet.app.admin.y_viet_admin.repository.clinic.ClinicRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ClinicImpl implements ClinicService {

    @Autowired
    private ClinicRepository clinicRepository;

    @Autowired
    private ClinicMapper clinicMapper;

    @Autowired
    private ClinicDetailService clinicDetailService;

    private ClinicEntity findClinicEntityById(String id) {
        Optional<ClinicEntity> clinicEntity = clinicRepository.findById(id);
        return clinicEntity.orElse(null);
    }


    @Override
    public Optional<String> create(ClinicCreateRequest t) {
        // add clinic
        ClinicEntity clinicEntity = clinicRepository.save(clinicMapper.toClinicEntity(t));

        // add clinic detail
        ClinicDetailEntity clinicDetailEntity = clinicMapper.toClinicDetailEntity(t);
        clinicDetailEntity.setClinicId(clinicEntity.getId());
        clinicDetailService.create(clinicDetailEntity);

        return Optional.of("Successfully created");
    }


    @Override
    public Optional<String> update(ClinicCreateRequest s) {
        return Optional.empty();
    }

    @Override
    public Optional delete(String id) {
        ClinicEntity clinicEntity = findClinicEntityById(id);
        clinicEntity.setIsDeleted(1);
        clinicRepository.save(clinicEntity);

        return Optional.of("Successfully deleted");
    }

    @Override
    public Optional<?> updateInfor(String id, ClinicCreateRequest clinicCreateRequest) {
        ClinicEntity clinicEntity = clinicRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.CLINIC_NOT_EXIST));
        BeanUtils.copyProperties(clinicCreateRequest, clinicEntity, getNullPropertyNames(clinicCreateRequest));

        return create(clinicCreateRequest);

    }

    @Override
    public List<ClinicGetResponse> findAll() {
        return clinicRepository.findAllClinics().orElse(new ArrayList<>());
    }

    @Override
    public ClinicGetResponse findById(String id) {
        return clinicRepository.findByIdClinic(id).orElse(null);
    }

    // Lấy tên các thuộc tính có giá trị null
    private String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
