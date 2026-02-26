public class Casting {
    public static void main(String[] args) {
        // Widening Casting (Auto) byte -> short -> int -> long -> float -> double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // Narrowing Casting (Manual) double -> float -> long -> int -> short -> byte
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
        byte iniByte2 = (byte) iniShort2;

        long longNumber = 100l;
        int intNumber = (int) longNumber;

        byte byteNumber = 9;
        double doubleNumber = (double) byteNumber;

        System.out.println(iniByte2);
        System.out.println(longNumber);

    }
}
