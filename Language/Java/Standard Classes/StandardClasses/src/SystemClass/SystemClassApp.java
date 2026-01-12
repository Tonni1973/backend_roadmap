package SystemClass;

public class SystemClassApp {
    public static void main(String[] args) {

        int i = 1;
        while(true){
            System.out.println("Hello world");
            if(i == 10){
                System.exit(1);
            }
            i++;
        }
    }
}
