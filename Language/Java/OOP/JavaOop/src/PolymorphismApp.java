public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee= new Employee("Tonni");
        employee.sayHello(new Manager("eko"));

        // polymorph
        employee = new Manager("Diki");
        employee.sayHello(new VicePresident("Dada"));
    }
}
