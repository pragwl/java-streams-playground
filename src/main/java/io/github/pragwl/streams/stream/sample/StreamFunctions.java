// StreamFunctions.java
package io.github.pragwl.streams.stream.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.stream.IntStream;

/**
 * Demonstrates various Stream API functions.
 */
public class StreamFunctions {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        // 1. Convert array into streams and calculate the sum.
        IntStream intStream = Arrays.stream(nums);
        int sum = intStream.sum();
        System.out.println("Sum : " + sum);

        // Stream cannot be reused after terminal operation.

        // 2. Print nums range.
        System.out.println(System.lineSeparator() + "Range [0, 10)");
        IntStream.range(0, 10).forEach(x -> System.out.print(x + " "));

        // 3. Filter nums range: find values greater than 4.
        System.out.println(System.lineSeparator() + "Greater than 4");
        IntStream.range(0, 10).filter(x -> x > 4).forEach(x -> System.out.print(x + " "));

        String[] names = {"Adam", "Daniel", "Martha", "Kevin", "Ben", "Joe", "Brad", "Susan"};

        // 4. Convert String array to stream.
        System.out.println(System.lineSeparator() + "Convert Arrays to stream by :: Arrays.stream()");
        Arrays.stream(names).forEach(x -> System.out.print(x + " "));

        // 5. Convert String array to stream using Stream.of().
        System.out.println(System.lineSeparator() + "Convert Arrays to stream by :: Stream.of()");
        Stream.of(names).forEach(x -> System.out.print(x + " "));

        // 6. Convert String array to stream and sort.
        System.out.println(System.lineSeparator() + "Convert Arrays to stream and sort by :: Stream.of().sorted()");
        Stream.of(names).sorted().forEach(x -> System.out.print(x + " "));

        // 7. Convert String array to stream and sort in reverse order.
        System.out.println(System.lineSeparator() + "Convert Arrays to stream and sort in reverse by :: Stream.of().sorted(Comparator.reverseOrder())");
        Stream.of(names).sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));

        // 8. Convert String array to stream and filter (Print all names starting with "A").
        System.out.println(System.lineSeparator() + "Convert Arrays to stream and filter (Print all names starts with A):: Stream.of(names).filter(x -> x.startsWith(\"A\"))");
        Stream.of(names).filter(x -> x.startsWith("A")).forEach(x -> System.out.print(x + " "));

        // 9. Print length of names in sorted order.
        System.out.println(System.lineSeparator() + "Print length of names in sorted way");
        Stream.of(names)
                .sorted(Comparator.comparing(String::length))
                .map(String::length)
                .forEach(x -> System.out.print(x + " "));

        // 10. Print distinct characters.
        System.out.println(System.lineSeparator() + "Print distinct characters");
        Stream.of(names)
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::print);
    }
}