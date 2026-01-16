package ObjectsClass;

import java.util.Objects;

public class ObjectsClassApp {
    public static void main(String[] args) {
        String product = "Indomie";
        String product2 = "Indomie";

        boolean flag = Objects.equals(product, product2);

        System.out.println(flag);
    }
}
