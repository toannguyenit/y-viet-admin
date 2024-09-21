package com.yviet.app.admin.y_viet_admin.repository.clinic;

import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicChangeEntity;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicChangeRepository extends JpaRepository<ClinicChangeEntity, String>, JpaSpecificationExecutor<ClinicChangeEntity> {

}
