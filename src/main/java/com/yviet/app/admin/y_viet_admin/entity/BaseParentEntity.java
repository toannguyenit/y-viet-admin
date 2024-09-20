package com.yviet.app.admin.y_viet_admin.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseParentEntity implements Serializable {

    @Column(nullable = false, updatable = false)
    LocalDateTime createdAt;

    @Column(insertable = false)
    LocalDateTime updatedAt;

    @Column(nullable = false)
    boolean isDeleted = false;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

}
