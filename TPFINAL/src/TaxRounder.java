public class TaxRounder {

    private static final double NEAREST_FACTOR = 0.05;

    public double round(double value) {
        return Math.ceil(value / NEAREST_FACTOR) * NEAREST_FACTOR;
    }
}