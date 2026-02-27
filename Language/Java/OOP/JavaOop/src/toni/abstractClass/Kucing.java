package toni.abstractClass;

public class Kucing extends Hewan{

    @Override
    void suara() {
        System.out.println("Meow");
    }

    @Override
    void run() {
        System.out.println("Runnnn!!!!!");
    }
}
