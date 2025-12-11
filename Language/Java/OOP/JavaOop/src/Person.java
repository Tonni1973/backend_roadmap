public class Person {
    // field
    String name;
    String address;
    final String country = "Indonesia";

    //
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    // method
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
