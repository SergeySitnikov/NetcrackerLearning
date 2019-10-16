import java.util.Random;

public class MillerRabin implements SearchPrimeNumbers {
    TestFerma methods = new TestFerma();
    public boolean isPrimeNumber(String number) throws NumberFormatException {
        long n = Long.parseLong(number);
        if (n == 2) {
            return true;
        }
        if (Main.initialCheck(n)) {
            long s = n - 1;
            while (s % 2 == 0)
                s /= 2;

            Random rand = new Random();
            for (int i = 0; i < 50; i++) {
                long r = Math.abs(rand.nextLong());
                long a = r % (n - 1) + 1, temp = s;
                long mod = this.methods.pows(a, temp, n);
                while (temp != n - 1 && mod != 1 && mod != n - 1) {
                    mod = this.methods.mul(mod, mod, n);
                    temp *= 2;
                }
                if (mod != n - 1 && temp % 2 == 0)
                    return false;
            }
        } else {
            return false;
        }
        return true;

    }







}
