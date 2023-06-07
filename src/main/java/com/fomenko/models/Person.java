package com.fomenko.models;

import jakarta.validation.constraints.*;

public class Person {
    private int person_id;

    @NotEmpty(message = "ФИО не должно быть пустым")
    @Size(min = 2, max = 200, message = "ФИО должно содержать от 2 до 200 символов")
    private String fullName;

    @Min(value = 0, message = "Год рождения должен быть старше 1900")
    @Max(value = 2023, message = "Год рождения не может быть старше 2023")
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
