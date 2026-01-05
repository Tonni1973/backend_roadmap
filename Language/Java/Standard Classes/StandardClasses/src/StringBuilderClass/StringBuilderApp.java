package StringBuilderClass;

public class StringBuilderApp {
    public static void main(String[] args) {
        // StringBuffer dan StringBuilder sebenarnya sama, namun yang membedakan adalah
        // StringBuffer lebih lambat karena thread safe sedangkan StringBuilder Tidak

        StringBuilder text = new StringBuilder("Hallo");
        text.append(" Nuna");
        text.append(" Selamat Pagi!");

        System.out.println(text.toString());
    }
}
