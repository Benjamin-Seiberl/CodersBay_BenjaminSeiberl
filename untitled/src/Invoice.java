import java.util.ArrayList;

public class Invoice {
    private final ArrayList<Product> products;
    double totalAmount;

    public Invoice(ArrayList<Product> products) {
        this.products = products;
    }

    public void print() {
        System.out.println();
        for (Product p : products) {
            System.out.printf(" %-9s: %4.2f \n", p.name, p.price);
        }
        System.out.println(balance());
    }

    public double balance() {
        return totalAmount;
    }
}
