import java.util.List;

public class Invoice {
    private List<Product> products;

    public Invoice(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice() + product.calculateTotalTax();
        }
        return total;
    }

    public double getTotalTax() {
        double totalTax = 0.0;
        for (Product product : products) {
            totalTax += product.calculateTotalTax();
        }
        return totalTax;
    }
}
