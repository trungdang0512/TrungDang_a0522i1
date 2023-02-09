package com.example.regform.utils.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneAnnotation implements ConstraintValidator<PhoneConstraint, String> {
    @Override
    public void initialize(PhoneConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        value = value.trim();
        return value.matches("/^0\\d{8,9}$/");
    }
}
