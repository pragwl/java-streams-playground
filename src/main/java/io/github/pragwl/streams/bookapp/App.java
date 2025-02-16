// App.java
package io.github.pragwl.streams.bookapp;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Demonstrates various uses of Java Streams API with a collection of Book objects.
 */
public class App {

    public static void main(String[] args) {
        List<Book> books = BookData.getBookData();

        // 1. Get list of books those types are novel
        System.out.println("List of books which type is Novel by :: filter(x -> x.getType().equals(Type.NOVEL))");
        List<Book> novelBooks = books.stream()
                .filter(book -> book.getType() == Type.NOVEL) // Direct enum comparison
                .collect(Collectors.toList()); // Use collect(toList()) instead of toList()
        novelBooks.forEach(System.out::println);

        // 2. Get list of books those types are novel in sorted manner (by author)
        System.out.println("List of books which type is Novel sort by author :: filter(x -> x.getType().equals(Type.NOVEL)).sorted(Comparator.comparing(Book::getAuthor))");
        List<Book> novelSortedBooksByAuthor = books.stream()
                .filter(book -> book.getType() == Type.NOVEL)
                .sorted(Comparator.comparing(Book::getAuthor))
                .collect(Collectors.toList());
        novelSortedBooksByAuthor.forEach(System.out::println);

        // 3. Get list of books title those types are novel in sorted manner (by author)
        System.out.println("List of books title which type is Novel sort by author :: filter(x -> x.getType().equals(Type.NOVEL)).sorted(Comparator.comparing(Book::getAuthor)).map(Book::getTitle)");
        List<String> novelBookTitles = books.stream()
                .filter(book -> book.getType() == Type.NOVEL)
                .sorted(Comparator.comparing(Book::getAuthor))
                .map(Book::getTitle)
                .collect(Collectors.toList());
        novelBookTitles.forEach(System.out::println);

        // 4. Group books by type
        System.out.println("Group by type");
        Map<Type, List<Book>> groupByType = books.stream().collect(Collectors.groupingBy(Book::getType));
        groupByType.entrySet().forEach(System.out::println);

        // 5. External and Internal Iteration (Illustrative)
        System.out.println("External Iteration");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("Internal Iteration");
        List<String> bookTitles = books.stream().map(Book::getTitle).collect(Collectors.toList());
        bookTitles.forEach(System.out::println);

        // 6. Longest 2 books
        System.out.println("Longest 2 books");
        books.stream()
                .sorted(Comparator.comparing(Book::getPages).reversed())
                .limit(2)
                .forEach(System.out::println);
    }
}