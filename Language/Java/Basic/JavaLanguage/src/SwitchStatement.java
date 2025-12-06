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
    }
}
