public class SwitchStatement {
    public static void main(String[] args) {
        // jika hanya menggunakan == dalam if maka switch menjadi solusinya

        var nilai = "D";

        switch (nilai) {
            case "A":
                System.out.println("Wow Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        // switch lambda

        switch (nilai){
            case "A" -> System.out.println("Wow anda lulus dengan sangat baik");
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }


        // yield untuk mengembalikan nilai

        String ucapan = switch (nilai){
            case "A":
                yield "Wow Anda lulus dengan baik";
            case "B", "C":
                yield  "Anda Lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan";
        };

        System.out.println(ucapan);


        char nilaiProksi = 'A';

        switch (nilaiProksi){
            case 'A':
                System.out.println("Nilai Memuaskan");
                break;
            case 'B':
                System.out.println("Nilai Cukup Memuaskan");
                break;
            case 'C':
                System.out.println("Nilai Cukup");
                break;
            default:
                System.out.println("Nilai Tidak Diketahui");
        }

//      switch lambda -> gunanya adalah tidak perlu menggunakan lagi break

        switch (nilaiProksi){
            case 'A' -> System.out.println("Wow Anda lulus");
            case 'B', 'C' -> System.out.println("Anda lulus" );
            case 'D' -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Anda Mungkin Salah jurusan");
            }
        }

        // yield

        String ucapanSelamat = switch (nilaiProksi){
            case 'A':
                yield "Wow";
            case 'B':
                yield "lulus";
            case 'C', 'D':
                yield "lulus, kurang";
            default:
                yield "Salah jurusan";
        };

        System.out.println(ucapanSelamat);
    }
}
