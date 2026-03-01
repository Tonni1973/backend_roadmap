package toni.Error;

public class Database {


    // ini juga tidak ada kata kunci throws pada methodnya

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
