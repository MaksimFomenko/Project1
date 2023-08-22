package com.fomenko.models;


import javax.validation.constraints.*;

public class Person {
    private int person_id;

    @NotEmpty(message = "ФИО не должно быть пустым")
    @Size(min = 2, max = 100, message = "ФИО должно быть от 2 до 100 символов")
    @Pattern(regexp = "[А-ЯЁ][а-яё]+ [А-ЯЁ][а-яё]+ [А-ЯЁ][а-яё]+", message = "ФИО должно включать в себя фамилию, имя, отчество начиная с больших букв")
    private String fullName;

    @Min(value = 1900, message = "Год рождения должен быть выше 1900")
    @Max(value = 2023, message = "Год рождения должен быть ниже 2023")
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
