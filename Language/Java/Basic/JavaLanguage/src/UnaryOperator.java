public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;

        // a++ untuk menambahkan satu setelah dieksekusi
        a++;
        System.out.println(a); // <-- kalau dipanggil di sini a++ maka hasilnya masih 10

        // ++a lansung menambahkan satu
        System.out.println(++a); // <-- di sini langsung hasil

        // begitu pun dengan operasi penguranan

        // angka negative

        int b = -10;
        int c = 10;

        // ! negasi

        System.out.println(b + c);

        boolean flag = !true;
        System.out.println(flag);

    }
}
