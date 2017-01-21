package ru.larin.laba1;

/**
 * Created by denislarin on 21.01.17.
 */
public class Book {
    private String author, name;
    private int pages;

    public Book() {
        author = "null";
        name = "null";
        pages = 0;
    }

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
