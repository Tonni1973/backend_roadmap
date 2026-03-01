package toni.InnerClass;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Car");
        vehicle.setNameCompany("Japan");


        Vehicle.Car car = vehicle.new Car();
        car.setBrand("Toyota");

        System.out.println(car.getNameCompany());
        System.out.println(car.getNameVehicle());
        System.out.println(car.getBrand());




    }
}
