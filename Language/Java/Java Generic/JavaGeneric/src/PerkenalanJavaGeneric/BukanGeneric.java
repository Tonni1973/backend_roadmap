package PerkenalanJavaGeneric;

public class BukanGeneric {
    public static void main(String[] args) {
        Data dataString = new Data();

        dataString.setData("Tonni");
        String value = (String) dataString.getData();
        System.out.println(value);
    }

    public static class Data {

        private Object data;

        public Object getData() {
            return data;
        }

        public void setData(Object data){
            this.data = data;
        }
    }


}


