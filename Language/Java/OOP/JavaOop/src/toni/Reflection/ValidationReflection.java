package toni.Reflection;

import toni.RuntimeException.BlankException;
import toni.exception.ValidationException;

import java.lang.reflect.Field;

public class ValidationReflection {

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field: fields){
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                // validate
                try {
                    String value = (String) field.get(object);
                    if(value == null || value .isBlank()){
                        throw new BlankException("Field "+ field.getName() + " is blank");
                    }

                } catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field"+ field.getName() );
                }
            }
        }
    }
}
