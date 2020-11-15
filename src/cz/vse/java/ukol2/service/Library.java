package cz.vse.java.ukol2.service;

import cz.vse.java.ukol2.model.*;

import java.util.ArrayList;
import java.util.List;

public class Library implements ILibrary {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getBookByName(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }
    @Override
    public List<Book> getBooksByAuthor(String authorFirstName, String authorLastName) {
        List<Book> result = new ArrayList<>();
        Person persona = new Person(authorFirstName,authorLastName);
        for (Book book : books){
            if (book.getAuthor().equals(persona)){
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> getBooksByCategory(String category) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory().equals(category)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public int getNumberOfBooks() {
        return books.size();
    }
}
