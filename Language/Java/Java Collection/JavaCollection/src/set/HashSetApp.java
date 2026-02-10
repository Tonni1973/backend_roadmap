package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Tonni");
        names.add("Ramdan");
        names.add("Budi");

        for(var name : names){
            System.out.println(name);
        }
    }
}
