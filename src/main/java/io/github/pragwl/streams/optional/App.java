// OptionalApp.java
package io.github.pragwl.streams.optional;

import io.github.pragwl.streams.bookapp.Book;
import io.github.pragwl.streams.bookapp.BookData;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Demonstrates the use of `Optional` with Java Streams.
 */
public class App {

    public static void main(String[] args) {
        // 1. Find the maximum number in a range using OptionalInt.
        System.out.println("Find Max number");
        OptionalInt max = IntStream.range(0, 50000).max(); // Simplified using max()
        max.ifPresent(System.out::println);

        // 2. Find the book with the maximum page size using Optional<Book>.
        List<Book> books = BookData.getBookData();
        System.out.println("Return Book Title whose page size is max");
        Optional<Book> book = books.stream().max((book1, book2) -> Integer.compare(book1.getPages(), book2.getPages())); //Simplified
        book.ifPresent(b -> System.out.println(b.getTitle()));

        // 3. Find the maximum book page size.
        System.out.println("Return max book page size");
        books.stream().map(Book::getPages).max(Integer::compare).ifPresent(System.out::println); //Simplified max() call

        // 4. Calculate the total number of pages.
        System.out.println("Total pages");
        int totalPages = books.stream().mapToInt(Book::getPages).sum();
        System.out.println(totalPages);
    }
}