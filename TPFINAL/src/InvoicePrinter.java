public class InvoicePrinter {

    public void printInvoice(Invoice invoice) {
        for (Product product : invoice.getProducts()) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }

        System.out.println("Sales Taxes: " + invoice.getTotalTax());
        System.out.println("Total: " + invoice.getTotalAmount());
    }
}

