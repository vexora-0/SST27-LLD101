public class ExpressCost implements IshippingCost {
    public double calculate(Shipment s) {
        return 80 + 8*s.weightKg;
    }
}
