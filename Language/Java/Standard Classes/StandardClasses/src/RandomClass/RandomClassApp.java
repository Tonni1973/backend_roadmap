package RandomClass;

import java.util.Random;

public class RandomClassApp {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        for (int i = 0; i < 100; i++) {
            var value = randomNumber.nextInt(1000);
            System.out.println(value);
        }
    }
}
