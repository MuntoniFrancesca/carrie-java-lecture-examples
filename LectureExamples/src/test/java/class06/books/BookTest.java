package class06.books;

import class06.books.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BookTest {

    Book testBook = new Book("Pride and Prejudice", "This timeless classic showcases Austen's wit and winsome characters", 12.49, 6, "Jane Austen", "Romantic Fiction", "Paperback");

    // TODO: Test that a Book object is given a name through inheritance
@Test
public void nameFieldIsInherited() {
    String msg = "a new object is given a name through the Product class constructor";
assertEquals("Pride and Prejudice", testBook.getName(), msg);
}
    // TODO: Test that a Book object is given a price through inheritance
@Test
    public void priceFieldIsInherited() {
    String msg = "a new object is given a price through the Product class constructor";
    assertEquals(12.49, testBook.getPrice(), msg);
}
    // Etc.
}