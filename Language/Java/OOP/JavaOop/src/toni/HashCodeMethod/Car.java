package toni.HashCodeMethod;

import java.util.Objects;

public class Car {
    String brand;
    String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name);
    }

}
