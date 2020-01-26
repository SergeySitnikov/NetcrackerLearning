import org.junit.Test;

import static org.junit.Assert.*;

public class SolovayStrassenTest {
    SolovayStrassen test = new SolovayStrassen();

    @Test
    public void yacoby() {
        assertEquals(1,test.algorithmYacoby(219, 383) );
    }

    @Test
    public void isPrimeNumber() {
        assertEquals(true, test.isPrimeNumber(31));
    }

    @Test
    public void isCompositeNumber() throws Exception {
        assertEquals(false, test.isPrimeNumber(121));
    }

    @Test
    public void isEvenNumber() throws Exception {
        assertEquals(false, test.isPrimeNumber(8));
    }

    @Test
    public void isNegativeNumber() throws Exception {
        assertEquals(false, test.isPrimeNumber(-4));
    }


}