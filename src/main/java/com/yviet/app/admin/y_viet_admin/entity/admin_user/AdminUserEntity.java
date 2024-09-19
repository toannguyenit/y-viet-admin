package com.yviet.app.admin.y_viet_admin.entity.admin_user;

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
@Table(name = "Admin_User")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdminUserEntity extends BaseStringEntity {
    @Column(nullable = false,unique = true)
    String username;

    @Column(nullable = false)
    String password;

    @Column(nullable = false,unique = true)
    String email;

    @Column(nullable = false,unique = true)
    String phone;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String gender;

    @Column(nullable = false)
    String status;

    @Column(nullable = false)
    String address;

}
