public class Car {

    String brand;
    String type;

    String name;


    Car(String brand, String type){
        // variable shadowing
//        brand = brand; --> null
//        type = type; --> null

        this.brand = brand;
        this.type = type;
    }

    Car(String brand){
        this(brand, null);
    }

    Car(){
        this(null);
    }

    void sayHello(){
        this.sayHello("Bos");
    }


    void sayHello(String name){
        System.out.println("Hello "+ name + ", My name is "+ this.name);
    }


}
