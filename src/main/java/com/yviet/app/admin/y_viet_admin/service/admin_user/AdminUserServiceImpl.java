package com.yviet.app.admin.y_viet_admin.service.admin_user;


import com.yviet.app.admin.y_viet_admin.config.security.jwt.JwtUtil;
import com.yviet.app.admin.y_viet_admin.entity.admin_user.AdminUserEntity;
import com.yviet.app.admin.y_viet_admin.repository.admin_user.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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

    @Override
    public Optional<AdminUserEntity> create(AdminUserEntity adminUserEntity) {
        adminUserEntity.setPassword(encoder.encode(adminUserEntity.getPassword()));
        return Optional.of(adminUserRepository.save(adminUserEntity));
    }

    @Override
    public AdminUserEntity update(AdminUserEntity adminUserEntity) {
        return null;
    }

    @Override
    public AdminUserEntity delete(int id) {
        return null;
    }
}
