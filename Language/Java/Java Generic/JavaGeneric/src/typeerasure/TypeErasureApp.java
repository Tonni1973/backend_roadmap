package typeerasure;

public class TypeErasureApp {
    public static void main(String[] args) {
        // type erasure --> menghilangkan type genericnya
        Data stringData = new Data<>("Toni");

        Data<Integer> integerData = (Data<Integer>) stringData;
//        Integer integer = integerData.getData(); // error saat runtime
    }

    public static class Data<T> {
        private T data;


        public Data(T data){
            this.data = data;
        }

        public T getData(){
            return data;
        }

        public void setData(T data){
            this.data = data;
        }
    }
}
