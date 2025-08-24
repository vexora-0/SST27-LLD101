public class WalletPayment implements IPaymentProvider {
    public String pay(Payment p) {
        return "Wallet debit: " + p.amount;
    }
}
