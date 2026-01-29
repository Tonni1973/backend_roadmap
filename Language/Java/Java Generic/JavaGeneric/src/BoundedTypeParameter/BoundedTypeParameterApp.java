package BoundedTypeParameter;

public class BoundedTypeParameterApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(100);

        // error
        // NumberData<String> stringNumberData = new NumberData<String>("10");
    }



    // membatasi tipe parameter
    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data){
            this.data = data;
        }

        public T getData(){
            return data;
        }
    }
}
