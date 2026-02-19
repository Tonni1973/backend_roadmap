package toni.HashCodeMethod;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Mazda";
        car.brand = "Mazda 3";
        System.out.println(car.hashCode());

        Car a = new Car();
        Car b = new Car();

        a.brand = "Toyota";
        a.name = "Corolla";

        b.brand = "Toyota";
        b.name = "Corolla";

        System.out.println(a.hashCode() == b.hashCode());

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}
