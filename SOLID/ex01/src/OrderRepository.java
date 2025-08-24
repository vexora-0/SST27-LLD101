public class OrderRepository implements IOrderRepository {
    public void save() {
        System.out.println("Order stored (pretend DB).");
    }
}
