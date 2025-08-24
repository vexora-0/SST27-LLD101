public class CardPayment implements IPaymentProvider {
    public String pay(Payment p) {
        return "Charged card: " + p.amount;
    }
}
