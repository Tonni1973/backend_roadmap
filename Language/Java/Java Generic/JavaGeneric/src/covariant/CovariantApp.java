package covariant;

import Invariant.MyData;
import MultipeBoundedTypeParameter.MultipleConstraintApp;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>("Budi");
        process(data);

        MyData<? extends Object> data1 = new MyData<>("Budi");
        Object obj = data1.getData();

    }

    public static void process(MyData<? extends Object> data){
        Object object = data.getData();
        //data.setData("Bob"); // karena bersifat read only
    }

    public static void init(MyData<? extends Object> data){
        Object obj = data.getData();
    }
}
