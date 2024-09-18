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
@Table(name = "Admin_User")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdminUser extends BaseEntity {
    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String password;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String gender;

    @Column(nullable = false)
    String status;

    @Column(nullable = false)
    String address;

}
