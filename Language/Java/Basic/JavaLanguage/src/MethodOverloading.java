public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Nuna");
        sayHello("Nuna", "Azzahra");
        sayHello("Bunga", "Nazwa", "Azzahra");
    }

    static void sayHello(){
        System.out.println("Hello there");
    }

    static void sayHello(String firstName){
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static void sayHello(String firstName, String middleName, String lastName){
        System.out.println("Hello "+ firstName + " " + middleName + " " + lastName);
    }
}
