public class SuperApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Tonni");

        System.out.println(manager.name);

        VicePresident vicePresident = new VicePresident("Eko");

        System.out.println(vicePresident.name);


        // memanggil class object
        var managerObject = new Manager("Tonni");
        System.out.println(manager); // otomatis memanggil toString
        System.out.println(manager.toString());
    }
}
