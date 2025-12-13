public class InheritanceApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Budi");


        var vicePresident = new VicePresident();
        vicePresident.name = "Nuna";
        vicePresident.sayHello("Zahra");
    }
}
