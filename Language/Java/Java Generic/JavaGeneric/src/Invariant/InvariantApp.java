package Invariant;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> dataString = new MyData<String>("Tonni");
//        MyData<Object> dataObject = dataString;

        // invariant artinya seperti tidak bisa polymorph mungkin
        MyData<Object> data = new MyData<>(100);
//        MyData<Integer> dataInteger = data;

    }
}
