package forecast.recursion;

public class ForecastCalculator {

    public static double predictValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialAmount = 10000.0;      
        double annualGrowthRate = 0.08;      
        int forecastYears = 5;              

        double result = predictValue(initialAmount, annualGrowthRate, forecastYears);

        System.out.printf("Forecasted value after %d years: %.2f%n", forecastYears, result);
    }
}
