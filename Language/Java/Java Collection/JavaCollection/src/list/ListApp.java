package list;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(100);

        strings.add("Tonni");
        strings.add("Budi");

        strings.set(1, "Toni");

        strings.remove(0);
        strings.add("Turkiye");

        System.out.println(strings);

        for(var name : strings){
            System.out.println(name);
        }
    }
}
