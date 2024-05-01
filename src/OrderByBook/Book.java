package OrderByBook;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private int pageCount;
    private String title;


    @Override
    public String toString() {
        return getTitle();
    }

    public Book(int pageCount, String title) {
        this.pageCount = pageCount;
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
