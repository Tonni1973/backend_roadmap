package typeerasure;

public class TypeErasureApp {
    public static void main(String[] args) {

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
