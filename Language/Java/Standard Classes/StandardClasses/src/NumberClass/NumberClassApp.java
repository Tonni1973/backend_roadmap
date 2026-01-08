package NumberClass;

public class NumberClassApp {
    public static void main(String[] args) {
        Integer a = 10;

        // method ini semua ada di kelas turunan Number
        Byte b = a.byteValue();

        System.out.println(b);
    }
}
