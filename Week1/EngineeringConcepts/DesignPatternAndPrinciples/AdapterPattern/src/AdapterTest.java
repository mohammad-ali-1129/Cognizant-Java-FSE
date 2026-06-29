package EngineeringConcepts.DesignPatternAndPrinciples.AdapterPattern.src;

public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor payPal = new PayPalAdapter();
        payPal.processPayment(1500);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(2500);
    }
}