package UUIDClass;

import java.util.UUID;

public class UuidClassApp {
    public static void main(String[] args) {

        String[] ids = new String[10];

        for (int i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            ids[i] = uuid.toString();
            System.out.println(uuid);
        }

        System.out.println(ids.length);
    }
}
