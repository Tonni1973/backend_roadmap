package toni.interface_inheritance;

public interface Car extends HasBrand {
    void drive();

    // default method adalah metode yang ditambahkan ke inteface untuk menerapkan method kontrit dan tidak merusak class class lain karena harus override
    default boolean isBig(){
        return false;
    };
}
