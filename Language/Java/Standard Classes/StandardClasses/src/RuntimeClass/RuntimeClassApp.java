package RuntimeClass;

public class RuntimeClassApp {
    public static void main(String[] args) {
        System.out.println();

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.freeMemory());
    }
}
