public class ForEach{
    public static void main(String[] args) {
        // for each digunakan untuk perulangan array agar lebih mudah

        String[] names = {
                "Nuna", "Azzahra", "Nazwa", "Shihab"
        };
        // dari pada seperti ini
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // mending seperti ini, lebih simple
        for(var value : names){
            System.out.println(value);
        }
    }
}
