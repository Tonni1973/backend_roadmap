public class Perulangan {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
            System.out.println(i + 1);
        }

        // perulangan tanpa henti
//        for (;;){
//            System.out.println("hello world");
//        }
//        var counter = 1;
//        for (; counter <= 10;){
//            System.out.println("hello world");
//            counter++;
//        }

        var a = 10;

        while (a <= 10){
            System.out.println("halo");
            a++;
        }

        var b = 5;

        do{
            System.out.println("woi");
            b++;
        } while(b <= 10);




    }
}
