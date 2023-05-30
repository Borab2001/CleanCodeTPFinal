import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private ProductFactory productFactory;
    private InvoicePrinter invoicePrinter;
    private List<Product> products;

    public Checkout(ProductFactory productFactory, InvoicePrinter invoicePrinter) {
        this.productFactory = productFactory;
        this.invoicePrinter = invoicePrinter;
        this.products = new ArrayList<>();
    }

    public void scan(String name, double price, ProductType type, boolean isImported) {
        Product product = productFactory.createProduct(name, price, type, isImported);
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void finish() {
        Invoice invoice = new Invoice(products);
        invoicePrinter.printInvoice(invoice);
    }
}
