public class Employee {
    String name;
    Employee(String name){
        this.name = name;
    }

    void sayHello(Employee employee){
        System.out.println("Hello"+ employee.name +"Hello my name is "+ this.name);
    }
}
