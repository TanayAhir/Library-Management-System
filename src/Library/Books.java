package Library;

public class Books {
    private String Author;
    private String Title;
    private String ISBN;
    private String PublicationYear;

    public Books() {}

    public Books(String Author, String Title, String ISBN, String PublicationYear) {
        this.Author = Author;
        this.Title = Title;
        this.ISBN = ISBN;
        this.PublicationYear = PublicationYear;

    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
