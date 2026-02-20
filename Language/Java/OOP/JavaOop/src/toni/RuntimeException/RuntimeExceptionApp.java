package toni.RuntimeException;


import toni.RecordClass.LoginRequest;
import toni.RuntimeException.ValidateUtil;

public class RuntimeExceptionApp {
    public static void main(String[] args)  {

        LoginRequest loginRequest = new LoginRequest("Nuna", "");

        try{
            ValidateUtil.validateRuntime(loginRequest);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        // tidak wajib dicatch tapi ada baiknya dicatch

//        ValidateUtil.validateRuntime(loginRequest);

        System.out.println("Hello");

    }
}
