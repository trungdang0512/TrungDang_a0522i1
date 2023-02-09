package com.example.regform.utils.annotation;

import org.hibernate.validator.internal.properties.Constrainable;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailAnnotation implements ConstraintValidator<EmailConstraint, String> {
    @Override
    public void initialize(EmailConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        value = value.trim();
        return value.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    }
}
