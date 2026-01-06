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
    }
}
