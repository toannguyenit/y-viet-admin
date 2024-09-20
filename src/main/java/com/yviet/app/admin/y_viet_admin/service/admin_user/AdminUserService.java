package com.yviet.app.admin.y_viet_admin.service.admin_user;

import com.yviet.app.admin.y_viet_admin.dto.request.admin_user.AdminUserRequest;
import com.yviet.app.admin.y_viet_admin.dto.request.admin_user.LoginRequest;
import com.yviet.app.admin.y_viet_admin.entity.admin_user.AdminUserEntity;
import com.yviet.app.admin.y_viet_admin.service.BaseService;

public interface AdminUserService extends BaseService<AdminUserEntity, AdminUserRequest,String,Integer> {
    String login(LoginRequest loginRequest) throws Exception;
}