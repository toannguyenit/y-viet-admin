package com.yviet.app.admin.y_viet_admin.entity.clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseLongEntity;
import com.yviet.app.admin.y_viet_admin.entity.BaseParentEntity;
import com.yviet.app.admin.y_viet_admin.entity.BaseStringEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "tbl_clinic_details")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClinicDetailEntity extends BaseParentEntity {

    @Id
    @Column(nullable = false, name = "clinic_id")
    String clinicId;

    @Column(nullable = false, name = "url_logo")
    String urlLogo;

    @Column(nullable = false, name = "city_id")
    Long cityId;

    @Column(nullable = false, name = "district_id")
    Long districtId;

    @Column(nullable = false, name = "ward_id")
    Long wardId;

    @Column(nullable = false)
    String address;

    @Column(nullable = false, name = "phone_number")
    String phoneNumber;
}
