import toni.belajarjava.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Buku", 50000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
