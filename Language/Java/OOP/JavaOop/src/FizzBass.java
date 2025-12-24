public class FizzBass {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                System.out.println(a[i]);
                System.out.println("Genap");
            } else {
                System.out.println(a[i]);
                System.out.println("Ganjil");
            }
        }

    }
}
