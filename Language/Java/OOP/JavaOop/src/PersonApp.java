public class PersonApp {
    public static void main(String[] args) {

        // inisialisasi object
        var person1 = new Person("Nazwa", "Cikoneng");
//        var person2 = new Person();
//
//        Person person3;
//        person3 = new Person();

        // memanggil field dan manipulasi field, field dengan final tidak bisa diubah
        person1.name = "Nuna";
        person1.address = "Cikonde";

        System.out.println("Nama Saya: "+ person1.name + " dan saya tinggal di "+ person1.address);

        // memanggil method
        person1.sayHello("Hex");
    }
}
