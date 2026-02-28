package toni.EqualsMethod;

public class Car {

    private String brand;
    private int numOfTires;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfTires() {
        return numOfTires;
    }

    public void setNumOfTires(int numOfTires) {
        this.numOfTires = numOfTires;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(!(obj instanceof Car)) return false;

        Car car = (Car) obj;

        if(car.numOfTires != this.numOfTires) return false;

        return brand != null ? brand.equals(car.brand) : car.brand == null;

    }
}
