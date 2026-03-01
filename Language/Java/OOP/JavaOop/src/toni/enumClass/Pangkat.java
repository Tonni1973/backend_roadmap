package toni.enumClass;

public enum Pangkat {
    Mayoor_Botak("Pertama kali main"),
    Mayor("Lumayan lama main"),
    Jendral("Sepuh");

    private String description;

    Pangkat(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
