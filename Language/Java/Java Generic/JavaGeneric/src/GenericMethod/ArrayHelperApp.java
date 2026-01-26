package GenericMethod;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Tonni", "Ramdani", "Mubaroq"};
        Integer[] values = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.<Integer>count(values));

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(values));
    }
}
