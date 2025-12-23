package toni.abstractClass;

public class KucingAPp {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();

        kucing.name = "Dorak";
        System.out.println(kucing.name);
        kucing.suara();

        kucing.bernafas();
    }
}
