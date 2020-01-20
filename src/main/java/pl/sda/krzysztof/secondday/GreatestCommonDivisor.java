package pl.sda.krzysztof.secondday;

public class GreatestCommonDivisor {

    public static int iterativeFindAsc(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static int iterativeFindDesc(int a, int b) {
        for (int i = b; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int recursiveEuclid(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return recursiveEuclid(b, a % b);
        }
    }

}
