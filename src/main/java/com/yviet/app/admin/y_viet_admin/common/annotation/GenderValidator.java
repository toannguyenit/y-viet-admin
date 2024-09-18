package com.yviet.app.admin.y_viet_admin.common.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<Gender, Integer> {

    @Override
    public void initialize(Gender constraintAnnotation) {
        // Khởi tạo nếu cần
    }

    @Override
    public boolean isValid(Integer gender, ConstraintValidatorContext context) {
        if (gender == null) {
            return false;
        }
        return gender == 0 || gender == 1;
    }
}