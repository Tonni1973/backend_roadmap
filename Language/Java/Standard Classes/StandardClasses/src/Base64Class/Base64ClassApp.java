package Base64Class;

import java.util.Base64;

public class Base64ClassApp {
    public static void main(String[] args) {
        String query = "belajar()   pemrograman     java";

        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encode);

        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);


        String password = "Rahasia";

        String encode1 = Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println(encode1);

        String decode1 = new String(Base64.getDecoder().decode(encode1));
        System.out.println(decode1);

    }
}
