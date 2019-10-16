public class SolovayStrassen extends TestFerma implements SearchPrimeNumbers {
    public boolean isPrimeNumber(String number) throws NumberFormatException {
        long n = Long.parseLong(number);
        if (n == 2) {
            return true;
        }
        if (Main.initialCheck(n)) {
            for (int i = 0; i < 100; i++) {
                long tmp = (long) (Math.random() * (n - 2) + 2);
                if (this.greatestCommonDivider(tmp, n) != 1) return false;
                long yacoby = this.algorithmYacoby(tmp, n);
                if (yacoby == -1) {
                    yacoby = n - 1;
                }
                if (this.pows(tmp, (n - 1) / 2, n) != yacoby) {
                    return false;
                }
            }

        } else {
            return false;
        }
        return true;
    }

        public int algorithmYacoby(long a, long b) {
        if (this.greatestCommonDivider(a, b) != 1) return 0;
        int r = 1;

        do {
            int t = 0;
            while (a % 2 == 0) {
                t++;
                a /= 2;
            }
            if (t % 2 != 0) {
                t = (int) (b % 8);
                if (t == 3 || t == 5) r = -r;
            }
            if (a % 4 == 3 && b % 4 == 3)
                r = -r;
                long c = a;
                a = b % c;
                b = c;

        } while (a != 0);
        return r;
    }
}
