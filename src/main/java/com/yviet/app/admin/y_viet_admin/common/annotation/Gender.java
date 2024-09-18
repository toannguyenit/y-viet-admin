package com.yviet.app.admin.y_viet_admin.common.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = GenderValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface Gender {
    String message() default "Gender must be 1 or 0";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}