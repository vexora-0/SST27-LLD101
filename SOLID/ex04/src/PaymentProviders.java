import java.util.HashMap;

public class PaymentProviders {
    HashMap<String, IPaymentProvider> providers = new HashMap<>();

    void init() {
        providers.put("CARD", new CardPayment());
        providers.put("UPI", new UpiPayment());
        providers.put("WALLET", new WalletPayment());
    }

    public String process(Payment p) {
        init();
        if (!providers.containsKey(p.provider)) {
            throw new RuntimeException("No provider");
        }
        return providers.get(p.provider).pay(p);
    }
}
