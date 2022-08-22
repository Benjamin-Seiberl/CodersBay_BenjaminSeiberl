public class A_8_1_Registrierkasse {
    public static void main(String[] args) {
        Register register = new Register();

        register.scanProduct(new Product(3.99, "Bread"));
        register.scanProduct(new Product(2.99, "Tomatoes"));
        register.scanProduct(new Product(1.50, "Butter"));

        register.generateInvoice();

        register.removeProduct(new Product(2.99, "Tomatoes"));

        register.generateInvoice();
    }
}
