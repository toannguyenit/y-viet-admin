package com.yviet.app.admin.y_viet_admin.entity.address;

import com.yviet.app.admin.y_viet_admin.entity.BaseLongEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "City")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City extends BaseLongEntity {
    @Column(nullable = false)
    String code;

    @Column(nullable = false,name = "name_vi")
    String nameVi;

    @Column(nullable = false,name = "name_en")
    String nameEn;

    @Column(nullable = false,name = "description_vi")
    String descriptionVi;

    @Column(nullable = false,name = "description_en")
    String descriptionEn;

}
