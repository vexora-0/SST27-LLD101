public class ShippingCostCalculator {
    ShippingCost shippingCost = new ShippingCost();
    double cost(Shipment s){
        return shippingCost.calculateCost(s);
    }
}
