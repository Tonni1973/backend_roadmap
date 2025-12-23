package toni.belajarjava.data;

public class ProductApp2 {
    public static void main(String[] args) {
        // access modifier
        Product product = new Product("Sabun", 4500);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
