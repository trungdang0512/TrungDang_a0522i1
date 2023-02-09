package com.example.regform.utils.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = EmailAnnotation.class)
public @interface EmailConstraint {
    String message() default "Wrong Email fomat!!";
    Class<?> [] group() default {};
    Class<? extends Payload>[] payLoad() default {};
}
