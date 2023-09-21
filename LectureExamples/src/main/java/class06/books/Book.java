package class06.books;

// TODO: Refactor class to inherit from Product
public class Book extends Product {

    private String author;
    private String genre;
    private String format;

    public Book(String name, String desc, double price, int quantity, String author, String genre, String format) {
      super(name, desc, price, quantity);
        this.author = author;
        this.genre = genre;
        this.format = format;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Author: " + author + newline +
                "Genre: " + genre + newline +
                "Format: " + format + newline;
    }

    // TODO: Define describe() as required by Product
public String describe() {
    String newline = System.lineSeparator();
    String pipe " | ";
        return getName() + " by " author + newLine +
            getDesc() + newLine +
            genre + pipe + format + pipe + getPrice() + newLine;
}
}
