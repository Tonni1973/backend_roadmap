package BigNumber;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger a =  new BigInteger("10000000000000000");
        BigInteger b =  new BigInteger("10000000000000000");

        BigInteger jumlah = a.add(b);

        System.out.println(jumlah);

    }
}
