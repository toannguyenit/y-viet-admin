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

    @GetMapping()
    public ResponseEntity<RestAPIResponse<Object>> getAllClinic() {
        return responseUtil.successResponse(
                clinicService.findAll()
        );
    }

    @GetMapping(ApiPath.ID)
    public ResponseEntity<RestAPIResponse<Object>> getClinicByid(@PathVariable(value = "id") String id) {
        return responseUtil.successResponse(
                clinicService.findById(id)
        );
    }

    @PutMapping(ApiPath.ID)
    public ResponseEntity<RestAPIResponse<Object>> updateClinic(@PathVariable(value = "id") String id,@RequestBody ClinicCreateRequest clinicCreateRequest) {
        return responseUtil.successResponse(
                clinicService.updateInfor(id, clinicCreateRequest)
        );
    }

    @PostMapping()
    public ResponseEntity<RestAPIResponse<Object>> createClinic(@RequestBody ClinicCreateRequest clinicCreateRequest) {
        return responseUtil.successResponse(
                clinicService.create(clinicCreateRequest)
        );
    }

    @DeleteMapping(ApiPath.ID)
    public ResponseEntity<RestAPIResponse<Object>> deleteClinic(@PathVariable(value = "id") String id) {
        return responseUtil.successResponse(
                clinicService.delete(id)
        );
    }


}
