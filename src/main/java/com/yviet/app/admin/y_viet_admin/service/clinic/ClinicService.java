package com.yviet.app.admin.y_viet_admin.service.clinic;

import com.yviet.app.admin.y_viet_admin.dto.request.clinic.ClinicCreateRequest;
import com.yviet.app.admin.y_viet_admin.dto.response.clinic.ClinicGetResponse;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicEntity;
import com.yviet.app.admin.y_viet_admin.service.BaseService;

import java.util.List;

public interface ClinicService extends BaseService<ClinicEntity,ClinicCreateRequest,String,ClinicCreateRequest> {
    List<ClinicGetResponse> findAll() ;

    ClinicGetResponse findById(String id) ;

}
