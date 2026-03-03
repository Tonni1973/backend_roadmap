package StringBuilderClass;

public class StringBuilderApp {
    public static void main(String[] args) {
        // StringBuffer dan StringBuilder sebenarnya sama, namun yang membedakan adalah
        // StringBuffer lebih lambat karena thread safe sedangkan StringBuilder Tidak
        // jadi jika butuh yang lebih cepat dan tidak butuh paralel maka gunakan StringBuilder

        StringBuilder text = new StringBuilder("Hallo");
        text.append(" Nuna");
        text.append(" Selamat Pagi!");

        System.out.println(text.toString());

        StringBuilder name = new StringBuilder("Tonni");
        name.append(" ");
        name.append("Ramdani");
        name.append(" ");
        name.append("Mubaroq");

        System.out.println(name);
    }
}
