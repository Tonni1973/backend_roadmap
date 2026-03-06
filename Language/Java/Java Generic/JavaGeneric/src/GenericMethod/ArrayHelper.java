package GenericMethod;

public class ArrayHelper {


    public static <T> int count(T[] array){
        return array.length;
    }

    public static <T> Object getFirst(T[] array){
        return array[0];
    }
}
