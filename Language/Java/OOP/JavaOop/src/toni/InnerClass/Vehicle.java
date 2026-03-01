package toni.InnerClass;

public class Vehicle extends Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameCompany(String name){
        super.setName(name);
    }

    public class Car {
        private String brand;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getNameVehicle(){
            return Vehicle.this.name;
        }

        public String getNameCompany(){
            return Vehicle.super.getName();
        }
    }
}
