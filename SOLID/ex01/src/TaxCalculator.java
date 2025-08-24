public class TaxCalculator implements ITaxCalculator {
    double taxRate = 0.18;
    public double calculateTotalWithTax(double subtotal) {
        return subtotal * this.taxRate + subtotal;
    }
}