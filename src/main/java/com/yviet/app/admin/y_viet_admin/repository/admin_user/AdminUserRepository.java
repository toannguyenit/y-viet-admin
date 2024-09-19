package com.yviet.app.admin.y_viet_admin.repository.admin_user;

import com.yviet.app.admin.y_viet_admin.entity.admin_user.AdminUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUserEntity, String>, JpaSpecificationExecutor<AdminUserEntity> {
}
