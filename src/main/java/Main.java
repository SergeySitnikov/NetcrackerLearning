import java.util.Scanner;

public class Main { //68763478963789333 is true, 6876347896378933337 is stackOverflowError, 567153675467 is true
    public static boolean[] isPrime = {false, false, false};

    public static void main(String[] args) {
        while (true) {
            System.out.println("Eater your number");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            try {
                long n = Long.parseLong(number);
                MillerRabin test = new MillerRabin(n);
                TestFerma test2 = new TestFerma(n);
                SolovayStrassen test3 = new SolovayStrassen(n);
                test.start();
                test2.start();
                test3.start();
                Thread.sleep(500);
                boolean flag = true;
                for (boolean b : isPrime) {
                    System.out.println(b);
                    if (b && flag) {
                        SearchPrimeNumberByEnumeration searcher = new SearchPrimeNumberByEnumeration(n);
                        System.out.println(searcher.isPrimeNumber() + " EnumerationTest");
                        flag = false;
                    }
                }
            } catch (NumberFormatException | InterruptedException ex) {
                System.out.println("Incorrect number");
                continue;
            }

        }
    }

    public static boolean initialCheck(long n) {
        if (n < 2)
            return false;
        if (n % 2 == 0)
            return false;
        return true;
    }
}
