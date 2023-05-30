import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class ProductFactoryImplTest {

    // ...

    @Test
    public void testProductCreationWithNullProductType() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProductFactoryImpl().createProduct("Book", 10.0, null, false);
        });
    }

    // ... plus de tests ...
}