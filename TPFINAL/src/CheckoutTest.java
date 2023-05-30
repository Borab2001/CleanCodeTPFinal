import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CheckoutTest {
    private Checkout checkout;
    private ProductFactory productFactory;
    private InvoicePrinter invoicePrinter;

    @Before
    public void setup() {
        productFactory = new ProductFactoryImpl();
        invoicePrinter = new InvoicePrinter();
        checkout = new Checkout(productFactory, invoicePrinter);
    }

    @Test
    public void testCheckoutScanAndFinish() {
        checkout.scan("Les Misérables", 6.90, ProductType.BOOK, false);
        checkout.scan("MacBook Pro", 1000.0, ProductType.OTHER, true);
        checkout.scan("Chouquettes", 1.60, ProductType.FOOD, false);
        checkout.scan("Doliprane", 2.18, ProductType.MEDICINE, false);
        assertDoesNotThrow(() -> checkout.finish());
    }

    @Test
    public void testCheckoutExampleScenario() {
        checkout.scan("Flacon de parfum importé", 27.99, ProductType.OTHER, true);
        checkout.scan("Flacon de parfum", 18.99, ProductType.OTHER, false);
        checkout.scan("Boîte de pilule contre la migraine", 9.75, ProductType.MEDICINE, false);
        checkout.scan("Boîte de chocolats importés", 11.25, ProductType.FOOD, true);

        checkout.finish();

        Invoice invoice = new Invoice(checkout.getProducts());

        assertEquals(6.70, invoice.getTotalTax(), 0.01);
        assertEquals(74.68, invoice.getTotalAmount(), 0.01);
    }
}
