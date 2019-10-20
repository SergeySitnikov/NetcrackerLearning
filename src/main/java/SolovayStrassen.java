public class SolovayStrassen extends Thread implements SearchPrimeNumbers {
    private long number;
    private TestFerma testFerma = new TestFerma();

    public SolovayStrassen(long number) {
        this.number = number;
    }

    public SolovayStrassen() {}

    public boolean isPrimeNumber() {

        if (number == 2) {
            return true;
        }
        if (Main.initialCheck(number)) {
            for (int i = 0; i < 100; i++) {
                long tmp = (long) (Math.random() * (number - 2) + 2);
                if (testFerma.greatestCommonDivider(tmp, number) != 1) return false;
                long yacoby = this.algorithmYacoby(tmp, number);
                if (yacoby == -1) {
                    yacoby = number - 1;
                }
                if (testFerma.pows(tmp, (number- 1) / 2, number) != yacoby) {
                    return false;
                }
            }

        } else {
            return false;
        }
        return true;
    }

    public int algorithmYacoby(long a, long b) {
        if (testFerma.greatestCommonDivider(a, b) != 1) return 0;
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

    @Override
    public void run() {
        System.out.println("start");
        Main.isPrime[2] = this.isPrimeNumber();
    }

    public boolean isPrimeNumber(long n) {
        this.number = n;
        return this.isPrimeNumber();
    }
}
