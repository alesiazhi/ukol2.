import cz.vse.java.ukol2.model.Book;
import cz.vse.java.ukol2.service.ILibrary;
import cz.vse.java.ukol2.service.Library;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testAdd() {
        ILibrary library = new Library();
        library.add(new Book(author,"Anna Karenina", 864, "Roman"));
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void testGetBookByName() {
        ILibrary library = new Library();
        library.getBookByName("Anna Karenina");
        assertEquals("Anna Karenina", library.getBookByName());
    }

    @Test
    public void testGetBookByAuthor() {
        ILibrary library = new Library();
        library.getBooksByAuthor("Lev","Tolstoy");
        assertEquals("Lev Tolstoy", library.getBooksByAuthor());
    }

    @Test
    public void testGetBookByCategoty() {
        ILibrary library = new Library();
        library.getBooksByCategory("Roman");
        assertEquals("Roman", library.getBooksByCategory());
    }


}

