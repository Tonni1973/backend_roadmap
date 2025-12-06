public class Percabangan {
    public static void main(String[] args) {
        var nilai = 69;
        var absen = 90;

        if (nilai >= 70 && absen >= 75){
            System.out.println("Anda Lulus dengan nilai baik");
        } else if (nilai >= 69 && absen >= 75) {
            System.out.println("Anda lulus dengan nilai cukup");
        } else {
            System.out.println("Anda tidak lulus");
        }
    }
}
