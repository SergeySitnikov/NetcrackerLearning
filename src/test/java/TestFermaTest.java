import org.junit.Test;

import static org.junit.Assert.*;

public class TestFermaTest {
    
    TestFerma test = new TestFerma();

    @Test
    public void isPrimeNumber() {
        assertEquals(true, test.isPrimeNumber("31"));
    }

    @Test
    public void isCompositeNumber() throws Exception {
        assertEquals(false, test.isPrimeNumber("121"));
    }

    @Test
    public void isEvenNumber() throws Exception {
        assertEquals(false, test.isPrimeNumber("8"));
    }

    @Test
    public void isNegativeNumber() throws Exception {
        assertEquals(false, test.isPrimeNumber("-4"));
    }

    @Test(expected = Exception.class)
    public void isOverflowParameter() throws Exception {
        test.isPrimeNumber("9,223,372,036,854,775,809");
    }

    @Test(expected = NumberFormatException.class)
    public void isStringParameter() throws NumberFormatException {
        test.isPrimeNumber("Hello");
    }

    @Test
    public void pows() throws Exception {
        assertEquals(3, test.pows(4,9,11));
    }

    @Test
    public void mul() throws Exception {
        assertEquals(3, test.mul(4,9,11));
    }
}