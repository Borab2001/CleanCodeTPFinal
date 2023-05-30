public interface ProductFactory {
    Product createProduct(String name, double price, ProductType type, boolean isImported) throws IllegalArgumentException;
}
