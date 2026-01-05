package StringBufferClass;

public class StringBufferApp {
    public static void main(String[] args) {
        // berbeda dengan string biasa, string buffer bersifat mutable (bisa didubah)
        // thread safe, artinya ketika ingin mengubah data secara bersamaan maka gunakan stringbuffer
        StringBuffer text = new StringBuffer("Hallo");
        text.append(" Nuna");

        System.out.println(text);
        System.out.println(text.length());

    }
}
