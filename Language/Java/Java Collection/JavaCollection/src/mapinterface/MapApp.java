package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("firstName", "Tonni");
        map.put("middleName", "Ramdani");
        map.put("lastName", "Mubaroq");

        System.out.println(map.get("firstName"));
        System.out.println(map.get("middleName"));
        System.out.println(map.get("lastName"));
    }
}
