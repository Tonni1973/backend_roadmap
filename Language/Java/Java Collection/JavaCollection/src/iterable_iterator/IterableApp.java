package iterable_iterator;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        // menggunakan class iterator
        Iterable<String> names = List.of("Tonni", "Ramdani", "Mubaroq");

        for (var name : names){
            System.out.println(name);
        }
    }
}
