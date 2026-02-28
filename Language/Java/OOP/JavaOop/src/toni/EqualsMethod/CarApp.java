package toni.EqualsMethod;

public class CarApp {
    public static void main(String[] args) {

        Car avanza = new Car();
        avanza.setBrand("Toyota");
        avanza.setNumOfTires(4);

        Car xenia = new Car();
        xenia.setBrand("Toyota");
        xenia.setNumOfTires(4);

        System.out.println(avanza.equals(xenia));

        System.out.println(xenia.equals(avanza));

        System.out.println(avanza);

    }
}
