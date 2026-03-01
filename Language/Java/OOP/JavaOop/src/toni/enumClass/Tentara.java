package toni.enumClass;

public class Tentara {
    public static void main(String[] args) {
        System.out.println(Pangkat.Mayoor_Botak);

        String pangkat = Pangkat.Mayoor_Botak.name();
        System.out.println(pangkat);


        System.out.println(Pangkat.Jendral.getDescription());


        Pangkat[] pangkats = Pangkat.values();

        for (var name : pangkats) {
            System.out.println(name);
        }
    }
}
