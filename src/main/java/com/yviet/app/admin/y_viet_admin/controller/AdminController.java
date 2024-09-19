package com.yviet.app.admin.y_viet_admin.controller;

import com.yviet.app.admin.y_viet_admin.common.constant.ApiPath;
import com.yviet.app.admin.y_viet_admin.common.restfulAPI.ResponseUtil;
import com.yviet.app.admin.y_viet_admin.common.restfulAPI.RestAPIResponse;
import com.yviet.app.admin.y_viet_admin.dto.request.admin_user.AdminUserRequest;
import com.yviet.app.admin.y_viet_admin.dto.request.admin_user.LoginRequest;
import com.yviet.app.admin.y_viet_admin.service.admin_user.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(ApiPath.ADMIN_API)
public class AdminController {

    @Autowired
    AdminUserService adminUserService;

    @Autowired
    ResponseUtil responseUtil;

    @PostMapping()
    public ResponseEntity<RestAPIResponse<Object>> createUser(@RequestBody AdminUserRequest adminUser) {
        return responseUtil.successResponse(
                adminUserService.create(adminUser)
        );
    }

    @PostMapping(ApiPath.LOGIN)
    public ResponseEntity<RestAPIResponse<Object>> login(@RequestBody LoginRequest loginRequest) throws Exception {
        return responseUtil.successResponse(
                adminUserService.login(loginRequest)
        );
    }


}
