package toni.exception;

import toni.RecordClass.LoginRequest;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if(loginRequest.username() == null){
            throw new ValidationException("Username tidak boleh nulll");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException(("Username tidak boleh kosong"));
        } else if (loginRequest.password() == null) {
            throw new ValidationException("Password tidak boleh null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password tidak boleh kosong");
        }
    }

    public static void validatePassword(String password) throws ValidatePassException{
        if(password == null){
            throw new ValidatePassException("password tidak boleh null, lol");
        } else if (password.isBlank()){
            throw new ValidatePassException("passwordk tidak boleh kosong, lol");
        } else if(password.length() <= 8){
            throw new ValidatePassException("panjang password harus lebih dari 8 lol");
        }
    }

}
