package EngineeringConcepts.FinancialForecasting;

public class Display {

    public static void show(FinancialData data, double futureValue) {

        System.out.println("Current Value : " + data.getCurrentValue());
        System.out.println("Growth Rate : " + (data.getGrowthRate() * 100) + "%");
        System.out.println("Years : " + data.getYears());
        System.out.println("Predicted Future Value : " + futureValue);
    }
}