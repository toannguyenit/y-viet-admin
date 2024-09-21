package com.yviet.app.admin.y_viet_admin.entity;

import com.yviet.app.admin.y_viet_admin.common.util.UniqueID;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseParentEntity implements Serializable {

    @Column(nullable = false, updatable = false)
    LocalDateTime createdAt;

    @Column(nullable = true, insertable = false)
    LocalDateTime updatedAt;

    @Column(nullable = false)
    int isDeleted;

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

}
