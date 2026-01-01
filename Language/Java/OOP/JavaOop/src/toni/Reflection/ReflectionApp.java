package toni.Reflection;

public class ReflectionApp {

    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Nuna");

        ValidationReflection.validationReflection(request);
    }
}
