public class Scope {
    public static void main(String[] args) {
        // sebuah variable hanay bisa dipakai di dalam area di mana mereka dibuat (diarea block)


    }

    static void sayHello(String name){
        String hello = "Hello " + name;
        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
//        System.out.println(hi); --> tidak bisa akses var hi karena beda scope
    }
}
