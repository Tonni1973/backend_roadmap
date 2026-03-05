package GenericClass;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<String>("Tonni");
        MyData<Integer> myDataInt = new MyData<Integer>(2);
        var myDataBoolean = new MyData<Boolean>(true);

        MyData<Long> myDataLong = new MyData<Long>(1000000000000000000l);


        System.out.println(myData.getData());
        System.out.println(myDataInt.getData());
        System.out.println(myDataBoolean.getData());

        System.out.println(myDataLong.getData());

    }
}
