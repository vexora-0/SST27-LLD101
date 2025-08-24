

public class Demo01 {
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();
        TaxCalculator taxCalculator = new TaxCalculator();
        OrderRepository orderRepository = new OrderRepository();
        OrderService orderService = new OrderService(taxCalculator, emailClient, orderRepository);
        orderService.checkout("a@shop.com", 100.0);
    }
}
