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
@Table(name = "Indication")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Indication extends BaseLongEntity {
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

    @Column(nullable = false,name = "model_name_vi")
    String modelNameVi;

    @Column(nullable = false,name = "model_name_en")
    String modelNameEn;

    @Column(nullable = false,name = "description_result_vi")
    String descriptionResultVi;

    @Column(nullable = false,name = "description_result_en")
    String descriptionResultEn;

    @Column(nullable = false,name = "conclusion_vi")
    String conclusionVi;

    @Column(nullable = false,name = "conclusion_en")
    String conclusionEn;

    @Column(nullable = false,name = "suggestion_vi")
    String suggestionVi;

    @Column(nullable = false,name = "suggestion_en")
    String suggestionEn;

    @Column(nullable = false,name = "url_icon")
    String urlIcon;

    @Column(nullable = false,name = "status")
    String status;

    @Column(nullable = false,name = "type")
    String type;

}
