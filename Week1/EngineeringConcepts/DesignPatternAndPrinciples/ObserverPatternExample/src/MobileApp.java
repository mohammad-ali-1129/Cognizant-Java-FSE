package EngineeringConcepts.DesignPatternAndPrinciples.ObserverPatternExample.src;

public class MobileApp implements Observer {

    @Override
    public void update(double price) {
        System.out.println("MobileApp: Stock price is " + price);
    }
}