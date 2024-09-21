package com.yviet.app.admin.y_viet_admin.entity.clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseParentEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class ClinicQueueNumberEntity extends BaseParentEntity {
    @Id
    @Column(nullable = false, name = "clinic_id")
    String clinicId;

    @Id
    @Column(nullable = false, name = "date")
    LocalDateTime date;

    @Id
    @Column(nullable = false, name = "number")
    int number;

    @Column(nullable = false, name = "clinic_visit_id")
    String clinicVisitId;

    @Column(nullable = false)
    String status;

}
