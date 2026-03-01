package toni.exception;

import toni.RecordClass.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("", "");

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException error){
            System.out.println(error.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("error tidak error tetap dipanggil");
        }

        System.out.println("hello");


        String password = "";

        try {
            ValidationUtil.validatePassword(password);
        } catch (ValidatePassException error){
            System.out.println(error.getMessage());
        } finally {
            System.out.println("error tidak error dipanggil");
        }

        System.out.println("berjalan dengan baik");

    }
}
