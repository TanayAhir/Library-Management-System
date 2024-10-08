package Library;

import java.util.ArrayList;

public class LibraryManagement {
    public static ArrayList<Books> availableBooks = new ArrayList<>();
    public static ArrayList<Books> borrowedBooks = new ArrayList<>();

    public void addBook(Books book) throws IllegalArgumentException {

        if(book.getAuthor()==null || book.getAuthor().isEmpty()){
            throw new IllegalArgumentException("Author cannot be null");
        }

        for (Books ab : availableBooks) {
            if(ab.getISBN().equals(book.getISBN())) {
                throw new IllegalArgumentException("A book with this ISBN already exists.");
            }

        }
        availableBooks.add(book);
    }
}
