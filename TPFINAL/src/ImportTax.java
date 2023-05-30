public class ImportTax implements Tax {

    private TaxRounder taxRounder;

    public ImportTax() {
        this.taxRounder = new TaxRounder();
    }

    @Override
    public double calculateTax(Product product) {
        if (!product.isImported()) {
            return 0;
        }

        double rawTax = product.getPrice() * 0.05;
        return taxRounder.round(rawTax);
    }
}
