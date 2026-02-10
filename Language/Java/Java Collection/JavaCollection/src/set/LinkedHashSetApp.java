package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();

        names.add("Budi");
        names.add("Rama");
        names.add("Ucup");

        for(var name : names){
            System.out.println(name);
        }
    }
}
