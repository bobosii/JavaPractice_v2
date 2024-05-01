package OrderByBook;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> orderByPageCount = new TreeSet<>(Comparator.comparing(Book::getPageCount));
        Set<Book> orderByTitle = new TreeSet<>();

        Book iktidar = new Book(331,"İktidar");
        Book aldaticiRast = new Book(431,"Aldatıcı Rastlantısallık");
        Book baslangic = new Book(231,"Başlangıç");
        Book georgeOrw = new Book(128,"1984");
        Book fahrenheit = new Book(98,"Fahrenheit");

        orderByTitle.add(iktidar);
        orderByTitle.add(fahrenheit);
        orderByTitle.add(aldaticiRast);
        orderByTitle.add(baslangic);
        orderByTitle.add(georgeOrw);

        orderByPageCount.add(iktidar);
        orderByPageCount.add(fahrenheit);
        orderByPageCount.add(aldaticiRast);
        orderByPageCount.add(baslangic);
        orderByPageCount.add(georgeOrw);

        for (Book book:orderByTitle){
            System.out.println(book.toString());
        }
        for (Book book: orderByPageCount){
            System.out.println(book.getPageCount());
        }
    }
}
