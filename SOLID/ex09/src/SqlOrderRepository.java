public class SqlOrderRepository implements IOrderRepository {
    public void save(String id){ 
        System.out.println("Saved order " + id + " to SQL"); 
    }
}
