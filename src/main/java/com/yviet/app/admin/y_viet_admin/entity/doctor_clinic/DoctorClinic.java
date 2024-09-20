package com.yviet.app.admin.y_viet_admin.entity.doctor_clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseLongEntity;
import com.yviet.app.admin.y_viet_admin.entity.BaseStringEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

import java.util.Set;

@Entity
@Table(name = "doctor_clinic")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DoctorClinic extends BaseStringEntity {

    @NotBlank
    @Size(max = 255)
    @Column(name = "name_vi", nullable = false)
    String nameVi;

    @NotBlank
    @Size(max = 255)
    @Column(name = "name_en", nullable = false)
    String nameEn;

    @NotBlank
    @Size(max = 50)
    @Column(nullable = false)
    Status status;

    public enum Status {
        ACTIVE,
        INACTIVE,
        PENDING
    }

    @OneToMany(mappedBy = "doctor_clinic", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<DoctorClinicPhoto> clinicPhotos;

    @OneToOne(mappedBy = "doctor_clinic", cascade = CascadeType.ALL, orphanRemoval = true)
    DoctorClinicSetting clinicSetting;

    @OneToOne(mappedBy = "clinic", cascade = CascadeType.ALL, orphanRemoval = true)
    DoctorClinicDetail clinicDetail;

    @OneToMany(mappedBy = "clinic", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<ClinicChange> clinicChanges;

    @OneToMany(mappedBy = "clinic", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<ClinicQueueNumber> clinicQueueNumbers;
}

