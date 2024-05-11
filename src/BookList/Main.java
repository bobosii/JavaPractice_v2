package BookList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Book b1 = new Book("b1",50,"b1","101010");
        Book b2 = new Book("b2",20,"b2","202020");
        Book b3 = new Book("b3",60,"b3","30303030");
        Book b4 = new Book("b4",420,"b4","404040");
        Book b5 = new Book("b5",520,"b5","50505050");
        Book b6 = new Book("b6",620,"b6","606060");
        Book b7 = new Book("b7",720,"b7","707070");
        Book b8 = new Book("b8",820,"b8","80808080");
        Book b9 = new Book("b9",920,"b9","909090");
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);
        bookList.add(b7);
        bookList.add(b8);
        bookList.add(b9);

        Map<String, String> titleAuthorMap = bookList.stream().collect(Collectors.toMap(Book::getTitle, Book::getAuthor));

        titleAuthorMap.forEach((title, author) -> System.out.println(title + " - " + author));
        List<Book> filteredList = bookList.stream().filter(i -> i.getBookPageCount() > 100).collect(Collectors.toList());

        filteredList.forEach(book -> System.out.println(book.getTitle() + " - " + book.getBookPageCount()));





    }
}
