import org.junit.Test;

import static org.junit.Assert.*;

public class MillerRabinTest {

    private MillerRabin millerRabin = new MillerRabin();


    @Test
    public void isPrimeNumber() {
        assertEquals(true, millerRabin.isPrimeNumber("31"));
    }

    @Test
    public void isCompositeNumber() throws Exception {
        assertEquals(false, millerRabin.isPrimeNumber("121"));
    }

    @Test
    public void isEvenNumber() throws Exception {
        assertEquals(false, millerRabin.isPrimeNumber("8"));
    }

    @Test
    public void isNegativeNumber() throws Exception {
        assertEquals(false, millerRabin.isPrimeNumber("-4"));
    }

    @Test(expected = Exception.class)
    public void isOverflowParameter() throws Exception {
        millerRabin.isPrimeNumber("9,223,372,036,854,775,809");
    }

    @Test(expected = NumberFormatException.class)
    public void isStringParameter() throws NumberFormatException {
        millerRabin.isPrimeNumber("Hello");
    }

    @Test
    public void modPow() {
        assertEquals(4, millerRabin.modPow(6,2,8));
    }

    @Test
    public void mulMod() {
        assertEquals(4, millerRabin.mulMod(5,3,11));
    }
}