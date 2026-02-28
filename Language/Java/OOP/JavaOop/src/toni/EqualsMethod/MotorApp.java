package toni.EqualsMethod;

public class MotorApp {
    public static void main(String[] args) {
        Motor marco = new Motor();
        marco.setName("Marco");
        marco.setNumberPlat(79);

        Motor marco2 = new Motor();
        marco2.setName("Marco");
        marco.setNumberPlat(79);

        System.out.println(marco.equals(marco2));




    }
}
