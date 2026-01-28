package covariant;

import Invariant.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>("Tonni");
        process(data);

    }

    public static void process(MyData<? extends Object> data){
        Object object = data.getData();
        //data.setData("Bob"); // karena bersifat read only
    }
}
