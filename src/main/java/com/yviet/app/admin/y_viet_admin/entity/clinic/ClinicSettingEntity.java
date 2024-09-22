package com.yviet.app.admin.y_viet_admin.entity.clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseLongEntity;
import com.yviet.app.admin.y_viet_admin.entity.BaseParentEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_clinic_setting")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClinicSettingEntity extends BaseParentEntity {

    @Id
    @Column(nullable = false, name = "clinic_id")
    String clinicId;

    @Column(nullable = false, name = "working_date_list")
    String workingDateList;

    @Column(nullable = false, name = "is_register_appointment")
    boolean isRegisterAppointment;

    @Column(nullable = false, name = "working_start_time")
    LocalDateTime workingStartTime;

    @Column(nullable = false, name = "working_end_time")
    LocalDateTime workingEndTime;

    @Column(nullable = false, name = "treatment_time")
    LocalDateTime treatmentTime;

    @Column(nullable = false, name = "is_authentication")
    boolean isAuthentication;


}
