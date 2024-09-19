package com.yviet.app.admin.y_viet_admin.entity;


import com.yviet.app.admin.y_viet_admin.common.util.UniqueID;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseLongEntity extends BaseParentEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @PrePersist
    protected void onCreate() {

        if (id == null) {
            id = Long.valueOf(UniqueID.getUUID());
        }
        setCreatedAt(LocalDateTime.now());
    }
}