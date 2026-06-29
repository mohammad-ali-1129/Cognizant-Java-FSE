package EngineeringConcepts.DesignPatternAndPrinciples.StrategyPatternExample.src;

public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.executePayment(2500);

        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.executePayment(1800);
    }
}