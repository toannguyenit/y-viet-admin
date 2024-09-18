package com.yviet.app.admin.y_viet_admin.entity.medical_standard;

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
@Table(name = "ICD")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LabTestIndication extends BaseEntity {

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

    @Column(nullable = false,name = "sheet_name_vi")
    String sheetNameVi;

    @Column(nullable = false,name = "sheet_name_en")
    String sheetNameEn;

    @Column(nullable = false,name = "describe_result_vi")
    String describeResultVi;

    @Column(nullable = false,name = "describe_result_en")
    String describeResultEn;

    @Column(nullable = false,name = "status")
    String status;

    @Column(nullable = false,name = "type")
    String type;
}
