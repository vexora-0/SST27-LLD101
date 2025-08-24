public class OrderService {
    ITaxCalculator taxCalculator;
    INotifier notifier;
    IOrderRepository orderRepository;
    public OrderService(ITaxCalculator taxCalculator, INotifier notifier, IOrderRepository orderRepository) {
        this.taxCalculator = taxCalculator;
        this.notifier = notifier;
        this.orderRepository = orderRepository;
    }
    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotalWithTax(subtotal);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
        orderRepository.save();
    }
}