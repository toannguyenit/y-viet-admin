package com.yviet.app.admin.y_viet_admin.dto.request.clinic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClinicCreateRequest {

    @JsonProperty("nameVi")
    String nameVi;

    @JsonProperty("nameEn")
    String nameEn;

    String status;

    @JsonProperty("urlLogo")
    String urlLogo;

    @JsonProperty("cityId")
    Long cityId;

    @JsonProperty("districtId")
    Long districtId;

    @JsonProperty("wardId")
    Long wardId;
    String address;

    @JsonProperty("phoneNumber")
    String phoneNumber;
}
