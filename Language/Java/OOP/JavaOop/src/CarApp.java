public class CarApp {
    public static void main(String[] args) {

        var toyota = new Car("Toyota", "Sedan");
        toyota.name = "Avanza";
        System.out.println(toyota.brand);

        toyota.sayHello();
    }
}
