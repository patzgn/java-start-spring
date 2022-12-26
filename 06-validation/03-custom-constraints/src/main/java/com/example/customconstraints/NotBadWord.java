package com.example.customconstraints;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = NotBadWordValidator.class)
@Target({FIELD})
@Retention(RUNTIME)
public @interface NotBadWord {
    String message() default "Text contains bad words";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    Lang[] lang() default Lang.PL;
}