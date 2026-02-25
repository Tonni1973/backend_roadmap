package toni.RecordClass;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Nuna", "rahasia");

        LoginRequest loginRequestDefault = new LoginRequest("Nuna");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(loginRequestDefault.username());
        System.out.println(loginRequestDefault);
    }
}
