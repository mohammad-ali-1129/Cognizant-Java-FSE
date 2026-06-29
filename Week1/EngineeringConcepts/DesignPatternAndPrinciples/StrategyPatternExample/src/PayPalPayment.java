package EngineeringConcepts.DesignPatternAndPrinciples.StrategyPatternExample.src;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using PayPal.");
    }
}