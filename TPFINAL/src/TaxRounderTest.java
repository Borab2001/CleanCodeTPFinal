import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxRounderTest {

    private TaxRounder taxRounder;

    @Before
    public void setup() {
        taxRounder = new TaxRounder();
    }

    @Test
    public void testRound() {
        assertEquals(2.05, taxRounder.round(2.04), 0.001);
        assertEquals(2.10, taxRounder.round(2.06), 0.001);
    }
}
