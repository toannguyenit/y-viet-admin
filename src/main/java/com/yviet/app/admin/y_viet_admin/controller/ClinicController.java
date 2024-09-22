package com.yviet.app.admin.y_viet_admin.controller;

import com.yviet.app.admin.y_viet_admin.common.constant.ApiPath;
import com.yviet.app.admin.y_viet_admin.common.restfulAPI.ResponseUtil;
import com.yviet.app.admin.y_viet_admin.common.restfulAPI.RestAPIResponse;
import com.yviet.app.admin.y_viet_admin.dto.request.clinic.ClinicCreateRequest;
import com.yviet.app.admin.y_viet_admin.service.clinic.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(ApiPath.CLINIC_API)
public class ClinicController {
    @Autowired
    ClinicService clinicService;

    @Autowired
    ResponseUtil responseUtil;


    @PostMapping()
    public ResponseEntity<RestAPIResponse<Object>> createClinic(@RequestBody ClinicCreateRequest clinicCreateRequest) {
        return responseUtil.successResponse(
                clinicService.create(clinicCreateRequest)
        );
    }
}
