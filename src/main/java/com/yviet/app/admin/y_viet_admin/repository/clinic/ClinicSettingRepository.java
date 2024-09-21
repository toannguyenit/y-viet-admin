package com.yviet.app.admin.y_viet_admin.repository.clinic;

import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicSettingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicSettingRepository extends JpaRepository<ClinicSettingEntity, String>, JpaSpecificationExecutor<ClinicSettingEntity> {
}
