package EngineeringConcepts.DesignPatternAndPrinciples.ObserverPatternExample.src;

public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        stockMarket.setStockPrice(1200.50);

        System.out.println();

        stockMarket.deregister(webApp);

        stockMarket.setStockPrice(1250.75);
    }
}



