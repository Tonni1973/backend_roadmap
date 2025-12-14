class Manager{
    String name;

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is Manager" + this.name);
    }
}

class VicePresident extends Manager {
    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is VicePresident "+ this.name);
    }
}
