package toni.interface_inheritance;

public class Avanza implements HasBrand, Car{
    public String getBrand(){
        return "Toyota";
    }

    public void drive(){
        System.out.println("Meluncur");
    }
}
