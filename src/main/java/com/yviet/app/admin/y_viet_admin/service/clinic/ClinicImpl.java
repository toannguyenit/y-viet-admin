package com.yviet.app.admin.y_viet_admin.service.clinic;

import com.yviet.app.admin.y_viet_admin.dto.request.clinic.ClinicCreateRequest;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicDetailEntity;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicEntity;
import com.yviet.app.admin.y_viet_admin.mapper.clinic.ClinicMapper;
import com.yviet.app.admin.y_viet_admin.repository.clinic.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClinicImpl implements ClinicService {

    @Autowired
    private ClinicRepository clinicRepository;

    @Autowired
    private ClinicMapper clinicMapper;

    @Autowired
    private ClinicDetailService clinicDetailService;


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
    public Optional<String> update(String s) {
        return Optional.empty();
    }

    @Override
    public Optional delete(String id) {
        return Optional.empty();
    }
}
