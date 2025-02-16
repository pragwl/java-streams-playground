// MatchesApp.java
package io.github.pragwl.streams.matches;

import io.github.pragwl.streams.bookapp.Book;
import io.github.pragwl.streams.bookapp.BookData;
import io.github.pragwl.streams.bookapp.Type;

import java.util.List;

/**
 * Demonstrates `allMatch`, `noneMatch`, `findAny`, and `findFirst` stream operations.
 */
public class App {

    public static void main(String[] args) {
        List<Book> books = BookData.getBookData();

        // 1. allMatch(): Checks if all elements match the predicate.
        boolean allPagesGreaterThan2000 = books.stream().allMatch(book -> book.getPages() > 2000);
        System.out.println("All books have more than 2000 pages: " + allPagesGreaterThan2000);

        // 2. noneMatch(): Checks if no elements match the predicate.
        boolean noPagesGreaterThan2000 = books.stream().noneMatch(book -> book.getPages() > 2000);
        System.out.println("No books have more than 2000 pages: " + noPagesGreaterThan2000);

        // 3. findAny(): Returns an arbitrary element that matches the predicate (if any).
        System.out.println("FindAny :: Novel Book");
        books.stream()
                .filter(book -> book.getType() == Type.NOVEL)
                .findAny()
                .ifPresent(System.out::println);

        // 4. findFirst(): Returns the first element that matches the predicate (if any).
        System.out.println("FindFirst :: Novel Book");
        books.stream()
                .filter(book -> book.getType() == Type.NOVEL)
                .findFirst()
                .ifPresent(System.out::println);
    }
}