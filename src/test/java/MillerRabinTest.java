import org.junit.Test;

import static org.junit.Assert.*;

public class MillerRabinTest {

    private MillerRabin millerRabin = new MillerRabin();


    @Test
    public void isPrimeNumber() {
        assertEquals(true, millerRabin.isPrimeNumber(31));
    }

    @Test
    public void isCompositeNumber() throws Exception {
        assertEquals(false, millerRabin.isPrimeNumber(121));
    }

    @Test
    public void isEvenNumber() throws Exception {
        assertEquals(false, millerRabin.isPrimeNumber(8));
    }

    @Test
    public void isNegativeNumber() throws Exception {
        assertEquals(false, millerRabin.isPrimeNumber(-4));
    }



}