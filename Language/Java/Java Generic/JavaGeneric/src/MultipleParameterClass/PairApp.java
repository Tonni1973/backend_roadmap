package MultipleParameterClass;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Tonni", 20);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Pair<String, String> name = new Pair<String, String>("Budi", "Setiawan");
        System.out.println(name.getFirst() + " " + name.getSecond());
    }
}
