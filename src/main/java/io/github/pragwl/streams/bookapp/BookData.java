// BookData.java
package io.github.pragwl.streams.bookapp;

import java.util.List;
import java.util.ArrayList;

/**
 * Provides sample book data for demonstration purposes.
 */
public class BookData {

    /**
     * Returns a list of sample books.
     *
     * @return A list of {@link Book} objects.
     */
    public static List<Book> getBookData() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
        books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
        books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
        books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
        books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
        books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
        books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));
        return books;
    }
}