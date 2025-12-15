class Manager_{
    String name;

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is Manager" + this.name);
    }
}

class VicePresident_ extends Manager_{
    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is VicePresident "+ this.name);
    }
}
