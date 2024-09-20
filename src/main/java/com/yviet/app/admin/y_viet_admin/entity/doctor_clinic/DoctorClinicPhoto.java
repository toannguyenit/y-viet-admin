package com.yviet.app.admin.y_viet_admin.entity.doctor_clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseStringEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "doctor_clinic_photo")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DoctorClinicPhoto extends BaseStringEntity {

    @ManyToOne
    @JoinColumn(name = "clinic_id", nullable = false)
    DoctorClinic clinic;

    @NotBlank
    @Size(max = 255)
    @Column(name = "url_photo", nullable = false)
    String urlPhoto;

    @NotBlank
    @Size(max = 50)
    @Column(nullable = false)
    String type;
}
