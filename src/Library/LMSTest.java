package Library;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class LMSTest {
    LibraryManagement lms;
    public static ArrayList<Books> availableBooks = new ArrayList<>();
    public static ArrayList<Books> borrowedBooks = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        lms = new LibraryManagement();
    }
    @Test
    public void addBook(){
        lms = new LibraryManagement();
        Books book = new Books("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "978-0439708180", "1997");
        lms.addBook(book);
    }

    @Test
    public void booksWithSameISBN(){
        lms = new LibraryManagement();
        Books book1 = new Books("J.K. Rowling", "Harry Potter and the Philosopher's Stone", "9780747532699", "1997");
        Books book2 = new Books("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "9780747532699", "1998");
        lms.addBook(book1);
        assertThrows(IllegalArgumentException.class, () -> lms.addBook(book2),
                "Adding a book with duplicate ISBN should thrown an IllegalArgumentException");
    }

}
