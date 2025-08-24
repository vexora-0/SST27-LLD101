public class StandardCost implements IshippingCost {
    public double calculate(Shipment s) {
        return 50 + 5*s.weightKg;
    }
}
