public class MethodArgument {
    public static void main(String[] args) {
        int[] nilai = {75, 75};
        sayCongrats("Nuna", nilai);

        ucapkanSelamat("Ucup", 65,75);

        ucapkan("Nuna", "Tonni", "Woi BOB");

        ucapkanArray(new String[]{"BoBO", "Tanginamo"});
    }
    // mengirim banyak argumen menggunakan array
    static void sayCongrats(String name, int[] values) {

        int total = 0;
        for (var value : values){
            total += value;
        }

        int finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat "+ name + ", Anda lulus");
        } else {
            System.out.println("Maaf "+ name + ", Anda tidak lulus");
        }
    }

    // mengirim banyak argument menggunakan method variable argument\

    static void ucapkanSelamat(String name, int... values){
        int total = 0;
        for (var value : values){
            total += value;
        }

        int finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat "+ name + ", Anda lulus");
        } else {
            System.out.println("Maaf "+ name + ", Anda tidak lulus");
        }
    }

    static void ucapkan(String... names){
        for (var name : names) {
            System.out.println(name);
        }
    }

    static void ucapkanArray(String[] names){
        for (var name : names) {
            System.out.println(name);
        }
    }
}
