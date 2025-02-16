# StreamFlow: Java Streams API Exercises

[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-17+-green.svg)](https://www.oracle.com/java/technologies/javase-jdk17-archive-downloads.html)
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen)](#)
[![GitHub Issues](https://img.shields.io/github/issues/yourusername/StreamFlow)](https://github.com/yourusername/StreamFlow/issues)
[![GitHub Stars](https://img.shields.io/github/stars/yourusername/StreamFlow?style=social)](https://github.com/yourusername/StreamFlow/stargazers)

**A Practical Guide to Mastering Java Streams API**

StreamFlow is a collection of Java code examples and exercises designed to help developers learn and practice using the Java Streams API. This project covers a wide range of stream operations, including filtering, mapping, reducing, collecting, and more. It's suitable for both beginners and experienced Java developers looking to enhance their understanding and skills in stream-based programming.  This project is built with Lombok to reduce boilerplate code and improve readability.

**Features:**

*   **Comprehensive Examples:**  Provides clear and concise examples of common stream operations.
*   **Practical Exercises:** Includes hands-on exercises to reinforce your learning.
*   **Lombok Integration:**  Utilizes Lombok to minimize boilerplate code, making the examples easier to read and understand.
*   **Well-Documented Code:**  Detailed Javadoc comments explain the purpose and usage of each class and method.
*   **Modular Structure:**  The project is organized into logical packages, making it easy to find and explore specific topics.
*   **Focus on Best Practices:**  Demonstrates best practices for using the Streams API, including proper resource management and error handling.

**Getting Started:**

1.  **Prerequisites:**
    *   Java 17 or higher
    *   Gradle (for building the project)
    *   An IDE with Lombok support (e.g., IntelliJ IDEA, Eclipse, VS Code with Lombok plugin)

2.  **Clone the Repository:**

    ```bash
    git clone https://github.com/pragwl/java-streams-playground.git
    cd java-streams-playground
    ```

3.  **Build the Project:**

    *   **Gradle:** `gradle clean build`

4.  **Install Lombok Plugin:**

    *   Install the Lombok plugin in your IDE.  Instructions can be found on the [Project Lombok website](https://projectlombok.org/).

5.  **Explore the Code:**

    The code is organized into the following packages:

    *   `io.github.pragwl.streams.bookapp`: Contains classes related to books, including the `Book` class, `Type` enum, and `BookData` for sample data.
    *   `io.github.pragwl.streams.filestream`: Demonstrates how to read data from a file using streams.
    *   `io.github.pragwl.streams.matches`:  Showcases the use of `allMatch`, `noneMatch`, `findAny`, and `findFirst` operations.
    *   `io.github.pragwl.streams.optional`:  Illustrates how to use `Optional` to handle potentially missing values in stream operations.
    *   `io.github.pragwl.streams.stream.sample`:  Provides a collection of general Stream API examples.

**Project Structure:**
```
java-stream-playground/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── io/github/pragwl/streams/
│ │ ├── bookapp/
│ │ │ ├── App.java # Main application demonstrating book-related stream operations
│ │ │ ├── Book.java # Book class (with Lombok annotations)
│ │ │ ├── BookData.java # Provides sample book data
│ │ │ └── Type.java # Enum representing book types
│ │ ├── filestream/
│ │ │ └── FileStream.java # Example of reading from a file using streams
│ │ ├── matches/
│ │ │ └── App.java # Demonstrates allMatch, noneMatch, findAny, findFirst
│ │ ├── optional/
│ │ │ └── App.java # Shows how to use Optional with streams
│ │ └── stream/sample/
│ │ └── StreamFunctions.java # General stream examples
├── build.gradle (if using Gradle)
└── README.md
```

**Examples:**

*   **Filtering Books by Type:** `io.github.pragwl.streams.bookapp.App` demonstrates how to filter a list of books to get only novels.
*   **Reading from a File:** `io.github.pragwl.streams.filestream.FileStream` shows how to read lines from a file and filter them based on a specific criteria.
*   **Using `Optional`:**  `io.github.pragwl.streams.optional.App` demonstrates how to handle potentially missing values when finding the maximum page size.

**License:**

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

**Contact:**

[Priyank Agrawal] - [a.priyank95@gmail.com]

**Dependencies:**

*   [Lombok](https://projectlombok.org/) - Reduces boilerplate code with annotations.  Make sure to install the Lombok plugin in your IDE.

**Note:**

This project requires an IDE with Lombok support.  Make sure to install the Lombok plugin before building and running the code.