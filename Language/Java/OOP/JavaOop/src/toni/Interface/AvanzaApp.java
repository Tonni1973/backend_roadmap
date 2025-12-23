package toni.Interface;

public class AvanzaApp {
    public static void main(String[] args) {
        Car avanza = new Avanza();

        avanza.drive();
        int tire = avanza.getTire();
        System.out.println(tire);
    }
}
