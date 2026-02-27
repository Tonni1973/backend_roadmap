public class KonversiTipeDataPrimitifKeNonPrimitif {
    public static void main(String[] args) {

        // primitif ke non primitif
        int age = 10;
        Integer age2 = age;


        // non primitif ke primitif
        // khusus integer
        Integer umur = 10;
        int umur2 = umur;

        short shortAge = umur.shortValue();
        byte byteAge = umur.byteValue();

        int intNumber = 100;

        Integer intNumberNonPrimitif = intNumber;


        byte byteNumber = intNumberNonPrimitif.byteValue();

        System.out.println(byteNumber);
    }
}
