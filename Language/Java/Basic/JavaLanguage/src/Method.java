public class Method {
    public static void main(String[] args) {
        sayHello("Nuna");
        int hasil = sum(19, 2);
        System.out.println("Hasil penjumlahan: "+ hasil);
    }

    static void sayHello(String name){
        System.out.println("Hello "+ name);
    }

    static int sum(int a, int b){
        return a + b;
    }



}
