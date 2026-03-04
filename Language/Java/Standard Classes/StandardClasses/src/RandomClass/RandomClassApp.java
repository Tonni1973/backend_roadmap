package RandomClass;

import java.util.Random;

public class RandomClassApp {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        for (int i = 0; i < 100; i++) {
            var value = randomNumber.nextInt(1000);
            System.out.println(value);
        }

        Random random = new Random();

//        for(int i = 0; i< 10; i++){
//            int num = random.nextInt(10); // --> parameter ini adalah diantara
//            System.out.println(num);
//        }


        // repeat until get 10
        int num = random.nextInt(11);
        while(num != 10){
            System.out.println(num);
            num = random.nextInt(11);
        }

        System.out.println(num);

    }
}
