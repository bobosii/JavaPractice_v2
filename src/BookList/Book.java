package BookList;

public class Book {
    private String title;
    private int bookPageCount;
    private String author;
    private String releaseDate;

    public Book(String bookName, int bookPageCount, String author, String releaseDate) {
        this.title = bookName;
        this.bookPageCount = bookPageCount;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookPageCount() {
        return bookPageCount;
    }

    public void setBookPageCount(int bookPageCount) {
        this.bookPageCount = bookPageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
