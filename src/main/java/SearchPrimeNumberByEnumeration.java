public class SearchPrimeNumberByEnumeration implements SearchPrimeNumbers {
    public SearchPrimeNumberByEnumeration() {
    }

    public boolean isPrimeNumber(String numberInStringFormat) throws NumberFormatException {
        long number = Long.parseLong(numberInStringFormat);
        if (number == 2)
            return true;
        if(Main.initialCheck(number)) {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
            return true;

    }
}