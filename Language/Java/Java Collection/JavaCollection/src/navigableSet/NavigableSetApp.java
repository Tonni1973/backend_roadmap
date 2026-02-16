package navigableSet;


import java.util.*;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Tonni", "Ramdani", "Mubaroq"));

        NavigableSet<String> namesDesc = names.descendingSet();
        NavigableSet<String> tonni = names.headSet("Tonni", true);

        for(var name : names){
            System.out.println(name);
        }

        NavigableSet<String> nami = Collections.unmodifiableNavigableSet(names);

//        nami.add("Tonni Ramdani2"); error

        for(var name : names){
            System.out.println(name);
        }

    }
}
