package toni.abstractClass;

public class KucingApp {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();

        kucing.name = "Dorak";
        System.out.println(kucing.name);
        kucing.suara();

        kucing.bernafas();

        kucing.run();
    }
}
