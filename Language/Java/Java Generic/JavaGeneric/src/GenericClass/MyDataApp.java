package GenericClass;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<String>("Tonni");
        MyData<Integer> myDataInt = new MyData<Integer>(2);
        var myDataBoolean = new MyData<Boolean>(true);


        System.out.println(myData.getData());
        System.out.println(myDataInt.getData());
        System.out.println(myDataBoolean.getData());

    }
}
