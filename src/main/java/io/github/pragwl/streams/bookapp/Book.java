// Book.java
package io.github.pragwl.streams.bookapp;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents a book with author, title, number of pages, and type.
 */
@Data
@AllArgsConstructor
public class Book {

	private String author;
	private String title;
	private int pages;
	private Type type;
}