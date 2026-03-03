package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        String[] names = {"Nuna", "Azzahra", "Nazwa"};

        // StringJoiner adalah class yang digunakan untuk membuat String sequence yang dipisahkan dengan delimiter
        // mendukung prefix dan suffix jika kita ingin manambakanya
        // berguna untuk memprint array dengan format yang kita mau

        StringJoiner joiner = new StringJoiner("||", "[", "]");

        for (var name: names){
            joiner.add(name);
        }

        System.out.println(joiner.toString());

        StringJoiner joiner1 = new StringJoiner(", ", "{ ", " }");

        String[] nama_lengkap = new String[3];
        nama_lengkap[0] = "Tonni";
        nama_lengkap[1] = "Ramdani";
        nama_lengkap[2] = "Mubaroq";

        for (var nama : nama_lengkap) {
            joiner1.add(nama);
        }

        System.out.println(joiner1);


    }
}
