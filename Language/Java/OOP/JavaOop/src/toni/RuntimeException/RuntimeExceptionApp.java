package toni.RuntimeException;


import toni.RecordClass.LoginRequest;

public class RuntimeExceptionApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Nuna", null);

        ValidateUtil.validateRuntime(loginRequest);

    }
}
