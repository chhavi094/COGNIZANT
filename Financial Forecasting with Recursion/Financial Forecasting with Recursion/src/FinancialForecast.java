public class FinancialForecast {

    // Recursive function to calculate future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case: value grows by rate each year
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}
