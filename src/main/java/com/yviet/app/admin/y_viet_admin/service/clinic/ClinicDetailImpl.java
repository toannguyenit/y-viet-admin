package com.yviet.app.admin.y_viet_admin.service.clinic;

import com.yviet.app.admin.y_viet_admin.dto.request.clinic.ClinicCreateRequest;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicDetailEntity;
import com.yviet.app.admin.y_viet_admin.mapper.clinic.ClinicMapper;
import com.yviet.app.admin.y_viet_admin.repository.clinic.ClinicDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClinicDetailImpl implements ClinicDetailService {

    @Autowired
    private ClinicDetailRepository clinicDetailRepository;

    @Autowired
    private ClinicMapper clinicMapper;

    @Override
    public Optional<String> create(ClinicDetailEntity t) {

        return Optional.of("Successfully created");
    }

    @Override
    public Optional<String> update(Integer integer) {
        return Optional.empty();
    }

    @Override
    public Optional<String> delete(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<?> updateInfor(String id, Integer integer) {
        return Optional.empty();
    }
}
