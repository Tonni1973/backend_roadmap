package toni.anonymouseClass;

public class HelloApp {

    private int num = 0;

    public static void main(String[] args) {



        Hello sayHello = new Hello(){
            @Override
            public void sayHelo(String name) {
                System.out.println("Hallo Nama Saya: "+ name);
            }
        };

        sayHello.sayHelo("Tonni");
    }
}
