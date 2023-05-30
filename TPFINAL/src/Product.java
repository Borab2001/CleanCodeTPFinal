public class Product {
    private String name;
    private double price;
    private ProductType type;
    private boolean isImported;
    private Tax importTax;
    private Tax vatTax;

    public Product(String name, double price, ProductType type, boolean isImported, Tax importTax, Tax vatTax) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.name = name;
        this.price = price;
        this.type = type;
        this.isImported = isImported;
        this.importTax = importTax;
        this.vatTax = vatTax;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductType getType() {
        return type;
    }

    public boolean isImported() {
        return isImported;
    }

    public double calculateTotalTax() {
        double totalTax = 0;
        totalTax += importTax.calculateTax(this);
        totalTax += vatTax.calculateTax(this);

        return totalTax;
    }
}
