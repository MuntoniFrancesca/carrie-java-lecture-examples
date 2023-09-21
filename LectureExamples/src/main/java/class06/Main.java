package class06;
import books.UsedBook;
import class06.books.Book;
import merchandise.Apparel;
import merchandise.Drinkware;

public class Main {

    public static void main(String[] args) {

        // TODO: Create several objects from the non-abstract classes
        Book book1 = new Book("Pride and Prejudice", "This timeless classic showcases Austin's wit and winsome characters", 12.49, 6, "Jane Austen", "Romantic Fiction", "Paperback" );
        Book book2 = new Book("Heidi", "The story of Heidi", 14.49, 2, "Pina", "Drama", "Paperback" );
        UsedBook usedBook1 = new UsedBook("Titanic", "A nice book", 2.00, 1, "Francesca", "Drama", "Paperback", "Used");
        UsedBook usedBook2 = new UsedBook("Amelie", "A great book", 3.00, 1, "Valeria", "Comic", "Paperback", "Used");
        Drinkware mug = new Drinkware("Mocha mug", "A cute mug", 7.39, 2, "Mugs", "Christmas", "Ceramic", 15.00);
        Drinkware tumbler = new Drinkware("Flower tumbler", "A cute tumbler", 8.39, 4, "Tumblers", "Christmas", "Stainless Steel", 8.00);
        Apparel tshirt = new Apparel("Christmas T-Shirt", "A Christmas tshirt", 12.00, 2, "Tshirts", "Christams", new String[]{"0S"}, new String[]{"navy", "gray"});
        Apparel sweater = new Apparel("Easter sweater", "An Easter sweater", 20, 6, "Sweaters", "Easter", new String[]{"XS", "S", "M", "L", "XL"}, new String[]{"black"});


        // TODO: Print each object created above
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(usedBook1);
        System.out.println(usedBook2);
        System.out.println(mug);
        System.out.println(tumbler);
        System.out.println(tshirt);
        System.out.println(sweater);
        // TODO: Increase the quantity of an apparel object by 5, then print the new quantity
        sweater.increaseQuantity(5);
        System.out.println(sweater.getQuantity());

        // TODO: Decrease the quantity of a drinkware object by 1, then print the new quantity
        mug.decreaseQuantity(1);
        System.out.println(mug.getQuantity());

        // TODO: Describe each object created above
        System.out.println(book1.describe());
        System.out.println(book2.describe());
        System.out.println(usedBook1.describe());
        System.out.println(usedBook2.describe());
        System.out.println(mug.describe());
        System.out.println(tumbler.describe());
        System.out.println(tshirt.describe());
        System.out.println(sweater.describe());
    }

}
