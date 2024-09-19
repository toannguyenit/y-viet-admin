package com.yviet.app.admin.y_viet_admin.entity.medical_standard;

import com.yviet.app.admin.y_viet_admin.entity.BaseLongEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Medicine")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Medicine extends BaseLongEntity {
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

    @Column(nullable = false,name = "type")
    String type;

}
