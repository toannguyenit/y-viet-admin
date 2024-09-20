package com.yviet.app.admin.y_viet_admin.service.admin_user;


import com.yviet.app.admin.y_viet_admin.config.security.jwt.JwtUtil;
import com.yviet.app.admin.y_viet_admin.dto.request.admin_user.AdminUserRequest;
import com.yviet.app.admin.y_viet_admin.dto.request.admin_user.LoginRequest;
import com.yviet.app.admin.y_viet_admin.entity.admin_user.AdminUserEntity;
import com.yviet.app.admin.y_viet_admin.exception.AppException;
import com.yviet.app.admin.y_viet_admin.exception.ErrorCode;
import com.yviet.app.admin.y_viet_admin.mapper.admin.AdminUserMapper;
import com.yviet.app.admin.y_viet_admin.repository.admin_user.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserRepository adminUserRepository;

    @Autowired
    @Lazy
    private PasswordEncoder encoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public Optional<String> create(AdminUserRequest adminUserRequest) {
        adminUserRequest.setPassword(encoder.encode(adminUserRequest.getPassword()));

        AdminUserEntity adminUserEntity = adminUserMapper.toAdminUserEntity(adminUserRequest);
        System.err.println(adminUserEntity);

        Optional.of(adminUserRepository.save(adminUserEntity));

        return "Register success".describeConstable();
    }

    @Override
    public Optional<String> update(Integer integer) {
        return Optional.empty();
    }


    @Override
    public Optional delete(String id) {
        return Optional.empty();
    }

    @Override
    public String login(LoginRequest loginRequest) throws Exception {

        AdminUserEntity user = adminUserRepository.findByUsername(loginRequest.getUsername())
                .orElseThrow(() -> new AppException(ErrorCode.INVALID_ACCOUNT));
        if (encoder.matches(loginRequest.getPassword(), user.getPassword())) {
            return jwtUtil.generateToken(loginRequest.getUsername());
        }
        throw new AppException(ErrorCode.INVALID_ACCOUNT);
    }
}
