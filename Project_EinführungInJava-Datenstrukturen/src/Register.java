import java.util.ArrayList;

public class Register {
    private final ArrayList<Product> products = new ArrayList<>();

    public void scanProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p) {
        products.removeIf(product -> product.name.equals(p.name));
    }

    public void generateInvoice() {
        Invoice invoice = new Invoice(products);
        invoice.print();
    }
}