public class ArrayApp {
    public static void main(String[] args) {
        String[] arrayString;

        arrayString = new String[3];

        arrayString[0] = "Nuna";
        arrayString[1] = "Azzahra";
        arrayString[2] = "Bunga";

        System.out.println(arrayString[1]);

        // bisa langsung diisi seperti ini
        int[] arrayInt = new int[]{
                10, 12, 2, 12, 4
        };

        long[] arrayLong = {
                10, 33, 12, 44, 10
        };
        System.out.println(arrayInt[1]);
        System.out.println(arrayString.length);
        System.out.println(arrayInt.length);

        // array di dalam array

        String[][] members = {
                {"Nuna", "Zahra"},
                {"Sampoena", "Gudang"},
                {"Garam garaman", "Madundun"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][1]);

    }
}
