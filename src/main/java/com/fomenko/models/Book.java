package com.fomenko.models;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int book_id;

    @NotEmpty(message = "Название книги не должно быть пустым")
    @Size(min = 2, max = 200, message = "Название книги должно быть от 2 до 200 символов")
    private String title;

    @NotEmpty(message = "Автор книги не должен быть пустым")
    @Size(min = 2, max = 100, message = "Автор книги должен содержать от 2 до 100 символов")
    private String author;

//    @NotEmpty(message = "Год рождения не должен быть пустым")
    @Min(value = 1900, message = "Год рождения должен быть выше 1900")
    @Max(value = 2023, message = "Год рождения не должен быть выше 2023")
    private int yearOfPublication;

    public Book() {

    }

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
