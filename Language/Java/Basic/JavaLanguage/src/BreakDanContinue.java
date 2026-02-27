public class BreakDanContinue {

    // break digunakan untuk menyelesaikan perulangan ketika ada kondisi tertentu
   // continue digunakan untuk melewati perulangan ketika ada kondisi tertentu
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                System.out.println(i);
                break;
            }
            System.out.println("Hello");
        }

        for (int i = 0; i < 10; i++) {
            // print hanya bilangan genap
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);

        }

        int nilai = 10;

        for(int i = 1; i <= 10; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println("print angka genap = "+ i);
        }
    }
}
