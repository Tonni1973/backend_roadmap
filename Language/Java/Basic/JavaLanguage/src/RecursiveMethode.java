public class RecursiveMethode {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
        loop(1000);
    }

    static int factorial(int value){
        var result = 1;
        for (int i = 1; i <= value; i++){
            result *= i;
        }
        return result;
    }

    // recursive methode

    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    // stackOverFlow
    static void loop(int value) {
        if(value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop-" + value);
            loop(value - 1);
        }
    }
}
