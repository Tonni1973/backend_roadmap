package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Tonni");
        names.add("Mubaroq");

        names.addAll(Arrays.asList("Programmer", "Zaman Now"));

        for(var name : names){
            System.out.println(name);
        }
    }
}
