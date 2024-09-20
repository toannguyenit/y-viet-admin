package com.yviet.app.admin.y_viet_admin.entity.doctor_clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseLongEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "doctor_clinic_detail")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DoctorClinicDetail extends BaseLongEntity {

    @Column(name = "url_logo")
    String urlLogo;
}
