package ru.skillbox;

public class Book {
    private final String name;
    private final String author;
    private final int amountOfPage;
    private final int isbn;

    public Book(String name, String author, int amountOfPage, int isbn) {
        this.name = name;
        this.author = author;
        this.amountOfPage = amountOfPage;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getAmountOfPage() {
        return amountOfPage;
    }

    public int getIsbn() {
        return isbn;
    }
}
