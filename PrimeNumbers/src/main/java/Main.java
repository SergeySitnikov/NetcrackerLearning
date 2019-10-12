import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SearchPrimeNumberByEnumeration searcher = new SearchPrimeNumberByEnumeration();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String numberS = sc.nextLine();
            try {
                if (searcher.isPrimeNumber(numberS)) {
                    System.out.println(numberS + " is a prime number ");
                } else {
                    System.out.println(numberS + " isn't a prime number");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect number");
                continue;
            }

        }
    }
}
