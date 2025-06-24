public class ForecastTest {
    public static void main(String[] args) {
        double initialInvestment = 10000.0;  // ₹10,000
        double annualGrowthRate = 0.08;     // 8%
        int years = 5;

        double futureValue = FinancialForecast.predictFutureValue(initialInvestment, annualGrowthRate, years);
        System.out.printf("Predicted Future Value after %d years: ₹%.2f%n", years, futureValue);
    }
}
