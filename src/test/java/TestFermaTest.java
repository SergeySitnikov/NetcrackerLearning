import org.junit.Test;

import static org.junit.Assert.*;

public class TestFermaTest {
    
    TestFerma test = new TestFerma();

    @Test
    public void isPrimeNumber() {
        assertEquals(true, test.isPrimeNumber(31));
    }

    @Test
    public void isCompositeNumber() throws Exception {
        assertEquals(false, test.isPrimeNumber(121));
    }

    @Test
    public void isTwo() throws Exception {
        assertEquals(true, test.isPrimeNumber(2));
    }

    @Test
    public void isEvenNumber() throws Exception {
        assertEquals(false, test.isPrimeNumber(8));
    }

    @Test
    public void isNegativeNumber() throws Exception {
        assertEquals(false, test.isPrimeNumber(-4));
    }


    @Test
    public void dividersTrue() {
        assertEquals(15, test.greatestCommonDivider(15,30));
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