package com.fomenko.models;

import jakarta.validation.constraints.*;

public class Person {
    private int person_id;

    @NotEmpty(message = "Full name should not be empty")
    @Size(min = 2, max = 200, message = "Full name should be between 2 and 200 characters")
    private String fullName;

    @Min(value = 0, message = "Year of birth should be greater than 1900")
    @Max(value = 2023, message = "Year of birth should be less than 2023")
    private int yearOfBirth;

    public Person() {

    }

    public Person(int person_id, String fullName, int yearOfBirth) {
        this.person_id = person_id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
