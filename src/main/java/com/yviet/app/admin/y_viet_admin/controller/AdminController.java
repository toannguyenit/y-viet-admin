package com.yviet.app.admin.y_viet_admin.controller;

import com.yviet.app.admin.y_viet_admin.common.constant.ApiPath;
import com.yviet.app.admin.y_viet_admin.common.restfulAPI.ResponseUtil;
import com.yviet.app.admin.y_viet_admin.common.restfulAPI.RestAPIResponse;
import com.yviet.app.admin.y_viet_admin.entity.admin_user.AdminUserEntity;
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
    public ResponseEntity<RestAPIResponse<Object>> createUser(@RequestBody AdminUserEntity adminUser) {
        return responseUtil.successResponse(
                adminUserService.create(adminUser)
        );
    }
}
