public class OperasiBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;


        System.out.println(a && c);
        System.out.println(a || b);
        System.out.println(!b);

        var absen = 75;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
