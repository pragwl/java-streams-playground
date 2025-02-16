// FileStream.java
package io.github.pragwl.streams.filestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Reads a file and prints lines containing a specific string.
 */
public class FileStream {

    public static void main(String[] args) throws IOException {
        String path = "names.txt";
        try (Stream<String> lines = Files.lines(Paths.get(path))) { //Try-with-resources for auto-closing
            lines.filter(name -> name.contains("iyan")).forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}