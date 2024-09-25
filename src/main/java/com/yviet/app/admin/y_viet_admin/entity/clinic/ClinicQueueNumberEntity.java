package com.yviet.app.admin.y_viet_admin.entity.clinic;

import com.yviet.app.admin.y_viet_admin.entity.BaseParentEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "clinic_queue_number")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClinicQueueNumberEntity extends BaseParentEntity {
    @Id
    @Column(nullable = false, name = "clinic_id")
    String clinicId;

    @Column(nullable = false, name = "date")
    LocalDateTime date;

    @Column(nullable = false, name = "number")
    int number;

    @Column(nullable = false, name = "clinic_visit_id")
    String clinicVisitId;

    @Column(nullable = false)
    String status;

}
