package toni.enumClass;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Nuna");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        // konversi jadi string
        String levelString = Level.STANDARD.name();

        System.out.println(levelString);

        Level level = Level.valueOf("STANDARD");

        System.out.println(level);

        Level[] values = Level.values();

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
