public class SuperApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Kiko");

        System.out.println(manager.name);

        VicePresident vicePresident = new VicePresident("Eko");

        System.out.println(vicePresident.name);
    }
}
