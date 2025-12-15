public class InheritanceApp {
    public static void main(String[] args) {
        var manager = new Manager_();
        manager.name = "Eko";
        manager.sayHello("Budi");


        var vicePresident = new VicePresident_();
        vicePresident.name = "Nuna";
        vicePresident.sayHello("Zahra");
    }
}
