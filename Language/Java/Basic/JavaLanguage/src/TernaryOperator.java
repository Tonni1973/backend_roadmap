public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary operator adalah operator sederhana dari if statement
        // Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil

        var nilai = 75;
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan coba lagi";

        System.out.println(ucapan);


        String name = "Null";

        String isNull = name == null ? "Yes that's null" : "No  its'n null, the name is "+ name;
        System.out.println(isNull);

    }
}
