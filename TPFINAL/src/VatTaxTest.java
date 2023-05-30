import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VatTaxTest {
    @Test
    public void testCalculateTaxForOtherProductType() {
        VatTax vatTax = new VatTax();
        Product product = new Product("Laptop", 1000.0, ProductType.OTHER, false, new VatTax(), new ImportTax());
        double tax = vatTax.calculateTax(product);
        assertEquals(100.0, tax, 0.0001);
    }
}