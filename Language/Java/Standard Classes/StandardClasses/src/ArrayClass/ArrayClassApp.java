package ArrayClass;


import java.util.Arrays;

public class ArrayClassApp {
    public static void main(String[] args) {
        String[] names = {"Tonni", "Ramdani", "Mubaroq"};

        String[] names2 = Arrays.copyOf(names, 2);

        // must be sort first
        Arrays.sort(names);

        int index = Arrays.binarySearch(names, "Ramdani");


        System.out.println(index);

        for (String name : names2){
            System.out.println(name);
        }

        String name = Arrays.toString(names2);
        System.out.println(name);
    }
}
