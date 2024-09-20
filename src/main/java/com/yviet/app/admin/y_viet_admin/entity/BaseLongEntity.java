package com.yviet.app.admin.y_viet_admin.entity;


import com.yviet.app.admin.y_viet_admin.common.util.UniqueID;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;


public abstract class BaseLongEntity extends BaseParentEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    Long id;

    @PrePersist
    protected void onCreate() {

        if (id == null) {
            id = Long.valueOf(UniqueID.getUUID());
        }
        setCreatedAt(LocalDateTime.now());
    }
}

