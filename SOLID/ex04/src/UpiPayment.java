public class UpiPayment implements IPaymentProvider {
    public String pay(Payment p) {
        return "Paid via UPI: " + p.amount;
    }
}
