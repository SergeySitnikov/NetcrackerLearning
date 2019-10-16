public class TestFerma implements SearchPrimeNumbers {
    public boolean isPrimeNumber(String number) throws NumberFormatException {
        long n = Long.parseLong(number);
        if (n == 2) {
            return true;
        }
        if (Main.initialCheck(n)) {
            for (int i = 0; i < 100; i++) {
                long tmp = (long)(Math.random()*(n-1) + 1);
                if (this.greatestCommonDivider(tmp, n) != 1) {
                    return false;
                }
                if (this.pows(tmp, n - 1, n) != 1) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;

    }

    protected long greatestCommonDivider(long a, long b) { //Create test
        if (b == 0) {
            return a;
        }
        return greatestCommonDivider(b, a % b);
    }

    public long pows(long a, long b, long m) {
        if (b == 0) return 1;
        if (b % 2 == 0) {
            long t = pows(a, b / 2, m);
            return this.mul(t, t, m); //%m
        }
        return (this.mul(pows(a, b - 1, m), a, m)); //%m
    }

    public long mul(long a, long b, long m) {
        if (b == 1) return a;
        if (b % 2 == 0) {
            long t = mul(a, b / 2, m);
            return (2 * t) % m;
        }
        return (mul(a, b - 1, m) + a) % m;
    }
}
