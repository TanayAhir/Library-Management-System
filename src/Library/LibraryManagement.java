package Library;

import java.util.ArrayList;

public class LibraryManagement {
    public static ArrayList<Books> availableBooks = new ArrayList<>();
    public static ArrayList<Books> borrowedBooks = new ArrayList<>();

    public void addBook(Books book) {
        if(availableBooks.contains(book)) {
            System.out.println("Book already available");
            return;
        }
        else
            availableBooks.add(book);
    }
}
