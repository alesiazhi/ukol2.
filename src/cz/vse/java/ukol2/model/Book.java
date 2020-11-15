package cz.vse.java.ukol2.model;

public class Book {
    
    private Person author;
    private String title;
    private int pages;
    private String category;

    public Book(Person author, String title, int pages, String category) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.category = category;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
