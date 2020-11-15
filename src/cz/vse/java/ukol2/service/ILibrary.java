package cz.vse.java.ukol2.service;

import cz.vse.java.ukol2.model.Book;
import java.util.List;

public interface ILibrary {

    /**
     * Metoda vlozi knihu do knihovny.
     * 
     * @param book kniha
     */
    void add(Book book);

    /**
     * Metoda najde (a vrati) prvni knihu, ktera ma dany nazev.
     * @param title nazev k vyhledani.
     * @return kniha
     */
    List<Book> getBookByName(String title);

    /**
     * Metoda vrati seznam knih, jejichz autor ma jmeno a prijmeni ze vstupu.
     * @param authorFirstName krestni jmeno autora
     * @param authorLastName prijmeni autora
     * @return seznam knih
     */
    List<Book> getBooksByAuthor(String authorFirstName, String authorLastName);

    /**
     * Metoda vrati seznam knih, ktere patri do kategorie, ktera je na vstupu metody.
     * @param category kategorie
     * @return seznam knih
     */
    List<Book> getBooksByCategory(String category);

    /**
     * Metoda vrati pocet knih.
     * @return pocet knih
     */
    int getNumberOfBooks();
}
