package BigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger a =  new BigInteger("10000000000000000");
        BigInteger b =  new BigInteger("10000000000000000");

        BigDecimal c = new BigDecimal("1.0000000000000000000");
        BigDecimal d = new BigDecimal("9.999999999999999999");


        BigInteger jumlah = a.add(b);

        BigDecimal jumlahDecimal = c.add(d);

        System.out.println(jumlah);

        System.out.println(c);

        System.out.println(jumlahDecimal);

    }
}
