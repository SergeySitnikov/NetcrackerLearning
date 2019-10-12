public class SearchPrimeNumberByEnumeration implements SearchSimpleNumbers {
    public SearchPrimeNumberByEnumeration() {
    }

    public boolean isPrimeNumber(String numberInStringFormat) throws NumberFormatException {
        long number;
        number = Long.parseLong(numberInStringFormat);
        if (number < 2) {
            return false;
        } else {
            if (number % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
