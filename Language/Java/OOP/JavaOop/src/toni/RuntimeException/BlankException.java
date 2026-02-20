package toni.RuntimeException;

public class BlankException extends RuntimeException{

    private String message;

    public BlankException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
