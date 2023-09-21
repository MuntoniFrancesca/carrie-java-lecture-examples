package books;
import class06.books.Book;
public class UsedBook extends Book {

    private final String condition;

    public UsedBook(String name, String desc, double price, int quantity, String author, String genre, String format, String condition) {
        super(name, desc, price, quantity, author, genre, format);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }


    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
               "Condition: " + condition + newline;
    }

    @Override
    public String describe() {
        String newLine = System.lineSeparator();
        String pipe = " | ";
        return getName() + " by " + getAuthor() + newLine +
                getDesc() + newLine +
                getGenre() + pipe + getFormat() + pipe + condition + pipe + getPrice() + newLine;
    }
}
