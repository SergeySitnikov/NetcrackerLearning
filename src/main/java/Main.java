import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SearchPrimeNumberByEnumeration searcher = new SearchPrimeNumberByEnumeration();
        MillerRabin test = new MillerRabin();
        System.out.println("Eater your number");

        while (true) {
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            try {
                System.out.println(searcher.isPrimeNumber(number));
                System.out.println(test.isPrimeNumber(number));
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect number");
                continue;
            }

        }
    }
}
