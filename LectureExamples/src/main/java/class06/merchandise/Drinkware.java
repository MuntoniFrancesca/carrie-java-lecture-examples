package merchandise;
import class06.merchandise.Merchandise;
public class Drinkware extends Merchandise {
    private final String material;
    private final double ounces;

    public Drinkware(String name, String desc, double price, int quantity, String category, String theme, String material, double ounce) {
        super(name, desc, price, quantity, category, theme);
        this.material = material;
        this.ounces = ounce;
    }

    public String getMaterial() {
        return material;
    }

    public double getOunces() {
        return ounces;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Material: " + material + newline +
                "Volume: " + ounces + " oz." + newline;
    }

    @Override
    public String describe() {
        String newLine = System.lineSeparator();
        String pipe = " | ";
        return ounces + " oz." + material + " " + getName() + newLine +
                getDesc() + newLine +
                getCategory() + pipe + getTheme() + pipe + getPrice() + newLine;
    }

}
