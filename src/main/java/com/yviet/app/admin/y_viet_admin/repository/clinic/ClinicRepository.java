package com.yviet.app.admin.y_viet_admin.repository.clinic;

import com.yviet.app.admin.y_viet_admin.dto.response.clinic.ClinicGetResponse;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClinicRepository extends JpaRepository<ClinicEntity, String>, JpaSpecificationExecutor<ClinicEntity> {

    @Query(value = "select tc.name_en as nameEn, tc.name_vi as nameVi, tc.status as status, " +
            "tcd.url_logo as urlLogo, tcd.address as address, tcd.phone_number as phoneNumber " +
            "from clinic tc join clinic_details tcd " +
            "on tc.id = tcd.clinic_id " +
            "where tc.is_deleted = 0", nativeQuery = true)
    Optional<List<ClinicGetResponse>> findAllClinics();


    @Query(value = "select tc.name_en as nameEn, tc.name_vi as nameVi, tc.status as status, " +
            "tcd.url_logo as urlLogo, tcd.address as address, tcd.phone_number as phoneNumber " +
            "from clinic tc join clinic_details tcd " +
            "on tc.id = tcd.clinic_id " +
            "where tc.is_deleted = 0 and tc.id = ?1", nativeQuery = true)
    Optional<ClinicGetResponse> findByIdClinic(String id);
}
