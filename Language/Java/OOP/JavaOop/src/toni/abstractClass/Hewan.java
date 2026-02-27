package toni.abstractClass;

// abstact class adalah blueprint atau bisa disebut kerangka dari class ini, implementasinya diserahkan kepada class childny
public abstract class Hewan {
    String name;
    String legs;


    abstract void suara();

    void bernafas(){
        System.out.println("Bernafass....");
    }

    abstract void run();
}
