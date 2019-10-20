import java.util.Random;

public class MillerRabin extends Thread implements SearchPrimeNumbers {
    private TestFerma methods = new TestFerma();
    private long number;

    public MillerRabin(long number) {
        this.number = number;
    }

    public MillerRabin() {}

    public boolean isPrimeNumber() {
        if (number == 2) {
            return true;
        }
        if (Main.initialCheck(number)) {
            long s = number - 1;
            while (s % 2 == 0)
                s /= 2;

            Random rand = new Random();
            for (int i = 0; i < 50; i++) {
                long r = Math.abs(rand.nextLong());
                long a = r % (number - 1) + 1, temp = s;
                long mod = this.methods.pows(a, temp, number);
                while (temp != number - 1 && mod != 1 && mod != number - 1) {
                    mod = this.methods.mul(mod, mod, number);
                    temp *= 2;
                }
                if (mod != number - 1 && temp % 2 == 0)
                    return false;
            }
        } else {
            return false;
        }
        return true;

    }

    @Override
    public void run() {
        Main.isPrime[0] = this.isPrimeNumber();
    }

    public boolean isPrimeNumber(long n) {
        this.number = n;
        return this.isPrimeNumber();
    }
}
