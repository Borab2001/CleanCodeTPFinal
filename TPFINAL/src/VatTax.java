public class VatTax implements Tax {

    private TaxRounder taxRounder;

    public VatTax() {
        this.taxRounder = new TaxRounder();
    }

    @Override
    public double calculateTax(Product product) {
        if (product.getType() == ProductType.FOOD || product.getType() == ProductType.BOOK || product.getType() == ProductType.MEDICINE) {
            return 0;
        }

        double rawTax = product.getPrice() * 0.1;
        return taxRounder.round(rawTax);
    }
}
