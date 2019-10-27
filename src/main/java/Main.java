import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main { //68763478963789333 is true, 6876347896378933337 is stackOverflowError, 567153675467 is true

    public static void main(String[] args) {
        while (true) {
            System.out.println("Eater your number");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            try {
                long n = Long.parseLong(number);
                MillerRabin millerRabin = new MillerRabin(n);
                TestFerma ferma = new TestFerma(n);
                SolovayStrassen solovayStrassen = new SolovayStrassen(n);
                Optional<Boolean> any = Arrays.asList(millerRabin, ferma, solovayStrassen).stream().parallel().map(it -> it.isPrimeNumber()).filter(it -> it).findAny();
                if (any.isPresent()) {
                    long l1 = System.nanoTime();
                    SearchPrimeNumberByEnumeration enumeration = new SearchPrimeNumberByEnumeration(n);
                    System.out.println(enumeration.isPrimeNumber());
                    System.out.println(System.nanoTime() - l1);
                } else {
                    System.out.println(false);
                }


            } catch (NumberFormatException ex) {
                System.out.println("Incorrect number");
                continue;
            }

        }
    }


}
