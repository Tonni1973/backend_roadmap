package PerkenalanJavaGeneric;

public class Generic {
    public static void main(String[] args) {
        Data<String> dataString = new Data<String>();

        dataString.setData("Toni");
        String value = dataString.getData();
        System.out.println(value);
    }

    public static class Data<T>{
        private T data;

        public T getData(){
            return data;
        }

        public  void setData(T data){
            this.data = data;
        }
    }
}
