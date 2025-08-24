public class OvernightCost implements IshippingCost {
    public double calculate(Shipment s) {
        return 120 + 10*s.weightKg;
    }
}
