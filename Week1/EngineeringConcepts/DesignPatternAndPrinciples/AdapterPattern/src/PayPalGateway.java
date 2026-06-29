package EngineeringConcepts.DesignPatternAndPrinciples.AdapterPattern.src;

public class PayPalGateway {

    public void makePayment(double amount) {
        System.out.println("Payment of Rs. " + amount + " processed using PayPal.");
    }
}