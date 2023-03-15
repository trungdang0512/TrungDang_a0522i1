package com.example.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateValidatorUsingDateFormat.class)
public @interface DateValidation {
    String message() default "The date is not valid. Try again!";
    Class<?>[] group() default {};
    Class<? extends Payload>[] payload() default {};
}
