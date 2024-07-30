package org.example;

public class Book {
    private String name;
    private int publicationYear;
    private String contents;

    public Book(String name, int publicationYear, String contents) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " (" + publicationYear + ")\nContents: " + contents;
    }
}

