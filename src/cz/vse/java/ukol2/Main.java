package cz.vse.java.ukol2;

import cz.vse.java.ukol2.service.Library;
import cz.vse.java.ukol2.model.*;

public class Main {

    public static void main(String[] args) {
        Person author = new Person("Lev", "Tolstoy");
        Library library = new Library();
        library.add(new Book(author, "Anna Karenina", 864, "Roman"));
        library.getBookByName("Anna Karenina");
        library.getBooksByAuthor("Lev", "Tolstoy");
        library.getBooksByCategory("Roman");
        library.getNumberOfBooks();
    }
}
