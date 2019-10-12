import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchPrimeNumberByEnumerationTest {

    private SearchPrimeNumberByEnumeration tester;

    @Before
    public void searchTest() {
        tester = new SearchPrimeNumberByEnumeration();
    }

    @Test
    public void isPrimeNumber() throws Exception {
        assertEquals(true, tester.isPrimeNumber("31"));
    }

    @Test
    public void isCompositeNumber() throws Exception {
        assertEquals(false, tester.isPrimeNumber("121"));
    }

    @Test
    public void isEvenNumber() throws Exception {
        assertEquals(false, tester.isPrimeNumber("8"));
    }

    @Test
    public void isNegativeNumber() throws Exception {
        assertEquals(false, tester.isPrimeNumber("-4"));
    }

    @Test(expected = Exception.class)
    public void isOverflowParameter() throws Exception {
        tester.isPrimeNumber("9,223,372,036,854,775,809");
    }

    @Test(expected = NumberFormatException.class)
    public void isStringParameter() throws NumberFormatException {
        tester.isPrimeNumber("Hello");
    }
}