import org.junit.Test;

// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ProductTest {

    @Test
    public void testProductCreationWithNegativePrice() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Product("Book", -10.0, ProductType.BOOK, false, new ImportTax(), new VatTax());
        });
    }

//    @Test
//    public void testProductWithEmptyName() {
//        assertThrows(IllegalArgumentException.class, () -> new Product("", 10.0, ProductType.BOOK, false, new ImportTax(), new VatTax()));
//    }

//    @Test
//    public void testProductWithNegativePrice() {
//        assertThrows(IllegalArgumentException.class, () -> new Product("Book", -10.0, ProductType.BOOK, false, new ImportTax(), new VatTax()));
//    }

//    @Test
//    public void testProductWithNullType() {
//        assertThrows(IllegalArgumentException.class, () -> new Product("Book", 10.0, null, false, new ImportTax(), new VatTax()));
//    }

//    @Test
//    public void testRoundingOfTaxes() {
//        Product product = new Product("Expensive imported item", 1000.00, ProductType.OTHER, true, new ImportTax(), new VatTax());
//        double tax = product.calculateTotalTax();
//        assertEquals(150.00, tax, 0.01);
//    }
}