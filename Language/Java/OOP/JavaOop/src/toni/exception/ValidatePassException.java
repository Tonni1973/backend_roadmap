package toni.exception;

public class ValidatePassException extends Throwable{

    private String message;

    public ValidatePassException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
