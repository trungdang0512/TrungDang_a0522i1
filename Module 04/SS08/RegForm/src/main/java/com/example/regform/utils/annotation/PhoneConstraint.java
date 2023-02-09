package com.example.regform.utils.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = PhoneAnnotation.class)
public @interface PhoneConstraint {
    String message() default "Wrong fomat!!";
    Class<?> [] group() default {};
    Class<? extends Payload>[] payLoad() default {};
}
