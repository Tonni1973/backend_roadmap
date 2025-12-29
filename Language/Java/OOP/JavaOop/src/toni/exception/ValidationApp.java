package toni.exception;

import toni.RecordClass.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        try{
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException e) {
            System.out.println("Terjadi Error Dengan Pesan : " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Terjadi Error Dengan Pesan : " + e.getMessage());
        } finally {
            System.out.println("Error gak error tetap dipanggil");
        }
    }
}
