public class TypeCheckApp {
    public static void main(String[] args) {
        sayHello(new VicePresident("Davin"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+ vicePresident.name);
        } else if (employee instanceof  Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello VP "+ employee.name);
        }
    }
}
