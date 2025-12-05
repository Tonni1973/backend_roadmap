public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 1000;
        int b = 100;

        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a + b);
        System.out.println(a % b);

        // augmented Assignments
        a += 10;
        System.out.println(a);
        a -= 10;
        System.out.println(a);
        a *= 10;
        System.out.println(a);
        a /= 10;
        System.out.println(a);
        a %= 10;
        System.out.println(a);

    }
}
