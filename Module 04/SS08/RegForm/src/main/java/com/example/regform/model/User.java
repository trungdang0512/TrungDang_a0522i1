package com.example.regform.model;

import com.example.regform.utils.annotation.EmailConstraint;
import com.example.regform.utils.annotation.PhoneConstraint;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotEmpty
    @NotBlank(message = "Do not blank!!")
    @Size(min = 5, max = 45, message = "5-45 chars")
    private String firstName;

    @NotEmpty
    @NotBlank(message = "Do not blank!!")
    @Size(min = 5, max = 45, message = "5-45 chars")
    private String lastName;

    @NotEmpty
    @NotBlank(message = "Do not blank!!")
    @Pattern(regexp = "(84|0)[0-9]{9,10}",message = "number phone must have 9 or 10 number")
    private String phone;

    @Min(18)
    @Max(100)
    private Integer age;

    @NotEmpty
    @NotBlank(message = "Do not blank!!")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Z|a-z]{2,}$",message = "invalid email!!")
    private String email;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String phone, Integer age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
