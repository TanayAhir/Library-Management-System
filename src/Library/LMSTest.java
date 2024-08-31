package Library;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

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
}
