public class Person {
    // field
    String name;
    String address;
    final String country = "Indonesia";



    // constructor overloading
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName){
        this(paramName, null);
    }

    Person(){
        this(null);
    };

    // method
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
