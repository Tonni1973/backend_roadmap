package navigableSet;


import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Tonni", "Ramdani", "Mubaroq"));

        NavigableSet<String> namesDesc = names.descendingSet();
        NavigableSet<String> tonni = names.headSet("Tonni", true);

        for(var name : names){
            System.out.println(name);
        }

    }
}
