package toni.anonymouseClass;

public class HelloWorldApp {
    public static void main(String[] args) {


        HelloWorld helloWorld = new HelloWorld() {
            public void sayHello(){
                System.out.println("Hello");
            }

            public void sayHello(String name){
                System.out.println("Hello "+ name);
            }
        };

        helloWorld.sayHello();
        helloWorld.sayHello("Nuna");

        HelloWorld hello = new HelloWorld(){
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }

            @Override
            public void sayHello(String name){
                System.out.println("Hello "+ name);
                System.out.println();
            }
        };

        hello.sayHello("Toni");
        hello.sayHello();
    }
}
