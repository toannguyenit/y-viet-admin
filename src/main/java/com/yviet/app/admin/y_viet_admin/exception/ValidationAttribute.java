package com.yviet.app.admin.y_viet_admin.exception;

public enum ValidationAttribute {
    MIN("min"),
    MAX("max"),
    VALUE("value"),
    NOT_NULL("notNull"),
    SIZE("size");
    // Thêm các thuộc tính khác mà bạn cần

    private final String key;

    ValidationAttribute(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
