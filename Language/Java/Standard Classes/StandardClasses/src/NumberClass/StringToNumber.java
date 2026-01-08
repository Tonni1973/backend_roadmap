package NumberClass;

public class StringToNumber {
    public static void main(String[] args) {
        String number = "100";

        // parse untuk tipe data primitif
        int numberInt = Integer.parseInt(number);

        // value of untuk tipe data non primitif
        Integer numberInteger = Integer.valueOf(number);
    }
}
