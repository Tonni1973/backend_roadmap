package StringClass;

public class StringApp {
    public static void main(String[] args) {
        String name = "Nuna";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.startsWith("Nu"));

        String[] split = name.split("N");
        System.out.println(split[1]);
    }
}
