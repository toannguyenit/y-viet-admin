package com.yviet.app.admin.y_viet_admin.entity.doctor_clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseLongEntity;
import com.yviet.app.admin.y_viet_admin.entity.BaseParentEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "doctor_clinic_setting")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DoctorClinicSetting extends BaseParentEntity {

    @Id
    @OneToOne
    @JoinColumn(name = "clinic_id", nullable = false)
    DoctorClinic clinic;

    @NotBlank
    @Column(name = "working_date_list", nullable = false)
    String workingDateList;

    @Column(name = "is_register_appointment", nullable = false)
    boolean isRegisterAppointment;

    @Column(name = "working_start_time", nullable = false)
    LocalDateTime workingStartTime;

    @Column(name = "working_end_time", nullable = false)
    LocalDateTime workingEndTime;

    @Column(name = "treatment_time", nullable = false)
    int treatmentTime;

    @Column(name = "is_authentication_required", nullable = false)
    boolean isAuthenticationRequired;
}
