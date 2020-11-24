package com.raghav.springbootapifirstdevelopment.model;

import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.*;

public class Person {
    private long id;
    private String firstName;
    @NotNull
    @NotBlank
    private String lastName;
    @Email()
    private String email;
    @Email()
    private String email1;
    @Min(18)
    @Max(30)
    private int age;
    @CreditCardNumber(ignoreNonDigitCharacters = true)
    private String creditCardNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
