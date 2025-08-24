public class OrderService {
    ITaxCalculator taxCalculator;
    INotifier notifier;
    public OrderService(ITaxCalculator taxCalculator, INotifier notifier) {
        this.taxCalculator = taxCalculator;
        this.notifier = notifier;
    }
    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotalWithTax(subtotal);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}