public class ProductFactoryImpl implements ProductFactory {
    public Product createProduct(String name, double price, ProductType type, boolean isImported) throws IllegalArgumentException {
        if (type == null) {
            throw new IllegalArgumentException("Product type cannot be null");
        }

        return new Product(name, price, type, isImported, new ImportTax(), new VatTax());
    }
}


