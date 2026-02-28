package toni.EqualsMethod;

import java.util.Objects;

public class Motor {
    private String name;
    private int numberPlat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberPlat() {
        return numberPlat;
    }

    public void setNumberPlat(int numberPlat) {
        this.numberPlat = numberPlat;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Motor)) return false;

        Motor motor = (Motor) obj;
        return motor.numberPlat == numberPlat &&
                Objects.equals(name, motor.name);
    }
}
