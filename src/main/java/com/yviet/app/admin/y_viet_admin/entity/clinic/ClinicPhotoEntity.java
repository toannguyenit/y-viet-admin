package com.yviet.app.admin.y_viet_admin.entity.clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseParentEntity;
import com.yviet.app.admin.y_viet_admin.entity.BaseStringEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "clinic_photo")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClinicPhotoEntity extends BaseStringEntity {


    @Column(nullable = false, name = "clinic_id")
    String clinicId;

    @Column(nullable = false, name = "url_photo")
    String urlPhoto;

    @Column(nullable = false, name = "type")
    String type;

}