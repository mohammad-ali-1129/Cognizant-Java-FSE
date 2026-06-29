package EngineeringConcepts.DesignPatternAndPrinciples.ObserverPatternExample.src;

public class WebApp implements Observer {

    @Override
    public void update(double price) {
        System.out.println("WebApp: Stock price is " + price);
    }
}