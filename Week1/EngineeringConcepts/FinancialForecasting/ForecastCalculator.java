package EngineeringConcepts.FinancialForecasting;

public class ForecastCalculator {

    public static double forecast(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return forecast(currentValue, growthRate, years - 1) * (1 + growthRate);
    }
}