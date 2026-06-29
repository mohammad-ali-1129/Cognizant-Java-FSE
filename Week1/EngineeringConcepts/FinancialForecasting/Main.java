package EngineeringConcepts.FinancialForecasting;

public class Main {

    public static void main(String[] args) {

        FinancialData data = new FinancialData(10000, 0.10, 5);

        double futureValue = ForecastCalculator.forecast(
                data.getCurrentValue(),
                data.getGrowthRate(),
                data.getYears()
        );

        Display.show(data, futureValue);
    }
}