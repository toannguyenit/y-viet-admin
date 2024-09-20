package com.yviet.app.admin.y_viet_admin.dto.request.admin_user;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdminUserRequest {
    String username;
    String password;
    String email;
    String phone;
    String name;
    String gender;
    String status;
    String address;
}
