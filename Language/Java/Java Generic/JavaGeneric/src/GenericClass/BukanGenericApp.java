package GenericClass;

public class BukanGenericApp {
    public static void main(String[] args) {
        BukanGeneric bukanGeneric = new BukanGeneric();
        BukanGeneric bukanGeneric1 = new BukanGeneric();

        bukanGeneric.setData("Budi");
        bukanGeneric1.setData(12);

        String name = (String) bukanGeneric1.getData(); // --> ini error integer tidak bisa dipaksakan menjadi String
    }
}
