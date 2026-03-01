package toni.RecordClass;

// secara default record class constructor akan dibuat otomatis sesuai dengan defisini record class parameter
public record LoginRequest(String username, String password) {


//    jika ingin menambahkan contructor pada record class maka harus memanggil compact constructor yaitu contructor tanpa tanda ()
    public LoginRequest {
        System.out.println("Constructor utama dipanggil");
    }


//    bisa overlaodingg tapi harus memanggil contructor utama

    public LoginRequest(String username){
        this(username, "");
    }
}
