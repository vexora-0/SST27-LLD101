import java.util.HashMap;

public class ShippingCost {
    HashMap<String, IshippingCost> costMap = new HashMap<>();

    void init() {
        costMap.put("STANDARD", new StandardCost());
        costMap.put("EXPRESS", new ExpressCost());
        costMap.put("OVERNIGHT", new OvernightCost());
    }
    public double calculateCost(Shipment s) {
        init();
        return costMap.containsKey(s.type) ? costMap.get(s.type).calculate(s) : 0;
    }
}
