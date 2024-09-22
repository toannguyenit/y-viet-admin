package com.yviet.app.admin.y_viet_admin.entity.clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseLongEntity;
import com.yviet.app.admin.y_viet_admin.entity.BaseStringEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "tbl_clinic")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClinicEntity extends BaseStringEntity {

    @UuidGenerator
    @Column(nullable = false,name = "code",unique = true)
    String code;

    @Column(nullable = false,name = "name_vi")
    String nameVi;

    @Column(nullable = false,name = "name_en")
    String nameEn;

    @Column(nullable = false)
    String status;
}
