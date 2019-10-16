import org.junit.Test;

import static org.junit.Assert.*;

public class SolovayStrassenTest {
    SolovayStrassen test = new SolovayStrassen();

    @Test
    public void isPrimeNumber() {
    }

    @Test
    public void yacoby() {
        assertEquals(1,test.algorithmYacoby(2, 5) );
    }
}