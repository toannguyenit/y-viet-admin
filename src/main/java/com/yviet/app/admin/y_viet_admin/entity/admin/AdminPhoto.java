package com.yviet.app.admin.y_viet_admin.entity.admin;

import com.yviet.app.admin.y_viet_admin.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Admin_Photo")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdminPhoto extends BaseEntity {

    @Column(nullable = false,name = "admin_id")
    String adminId;

    @Column(nullable = false,name = "url_photo")
    String urlPhoto;

    @Column(nullable = false,name = "type")
    String type;
}
