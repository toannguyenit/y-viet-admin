package com.yviet.app.admin.y_viet_admin.entity;

import com.yviet.app.admin.y_viet_admin.common.util.UniqueID;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class BaseStringEntity extends BaseParentEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @UuidGenerator
    String id;

    @PrePersist
    protected void onCreate() {

        if (id == null) {
            id = UniqueID.getUUID();
        }
        super.onCreate();
    }
}