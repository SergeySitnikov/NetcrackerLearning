import java.util.Scanner;

public class Main { //68763478963789333 is true, 6876347896378933337 is stackoverflowErrer
    public static void main(String[] args) {
        SearchPrimeNumberByEnumeration searcher = new SearchPrimeNumberByEnumeration();
        MillerRabin test = new MillerRabin();
        TestFerma test2 = new TestFerma();
        SolovayStrassen test3 = new SolovayStrassen();
        System.out.println("Eater your number");

        while (true) {
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            try {
                System.out.println(searcher.isPrimeNumber(number));
                System.out.println(test.isPrimeNumber(number));
                System.out.println(test2.isPrimeNumber(number));
                System.out.println(test3.isPrimeNumber(number));
            } catch (NumberFormatException ex) {
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
