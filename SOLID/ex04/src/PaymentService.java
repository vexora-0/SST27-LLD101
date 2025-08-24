
public class PaymentService {
    PaymentProviders providers = new PaymentProviders();

    String pay(Payment p) {
        return providers.process(p);
    }
}