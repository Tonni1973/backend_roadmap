package toni.EqualsMethod;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Nuna";
        first = first + " " + "Azzahra";
        String second = "Nuna Azzahra";

        System.out.println(first == second);

        System.out.println(first.equals(second));


        // objek sama namun di memori berbeda
        Product a = new Product();
        Product b = new Product();

        a.name = "Sabun Abc";
        a.price = 2000;

        b.name = "Sabun Abc";
        b.price = 2000;

        System.out.println(a.equals(b));

        System.out.println(a.equals(a));
    }
}
