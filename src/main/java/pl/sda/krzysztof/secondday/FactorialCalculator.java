package pl.sda.krzysztof.secondday;

import java.math.BigInteger;

public class FactorialCalculator {

    public static int calculate(int a) {
        if (a == 1) {
            return 1;
        }
        return a * calculate(a - 1);
    }

    private static BigInteger calculateBigInteger(BigInteger a) {
        if (a.equals(new BigInteger("1"))) {
            return new BigInteger("1");
        }
        return a.multiply(calculateBigInteger(a.subtract(new BigInteger("1"))));
    }
}
