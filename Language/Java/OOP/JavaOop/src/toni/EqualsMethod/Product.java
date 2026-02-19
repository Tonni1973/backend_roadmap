package toni.EqualsMethod;

import java.util.Objects;

public class Product {
    protected String name;
    protected int price;

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Product)) return false;

        Product product = (Product) o;

        if(price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
