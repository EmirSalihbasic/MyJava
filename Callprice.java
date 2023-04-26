public class BlackScholes {

    public static void main(String[] args) {
        double S = 50; // stock price
        double K = 55; // strike price
        double r = 0.05; // risk-free interest rate
        double T = 0.5; // time to expiration (in years)
        double sigma = 0.3; // volatility

        double callPrice = blackScholes(S, K, r, T, sigma);
        System.out.println("Call price: " + callPrice);
    }

    public static double blackScholes(double S, double K, double r, double T, double sigma) {
        double d1 = (Math.log(S / K) + (r + sigma * sigma / 2) * T) / (sigma * Math.sqrt(T));
        double d2 = d1 - sigma * Math.sqrt(T);
        double Nd1 = cumulativeNormalDistribution(d1);
        double Nd2 = cumulativeNormalDistribution(d2);
        double callPrice = S * Nd1 - K * Math.exp(-r * T) * Nd2;
        return callPrice;
    }

    private static double cumulativeNormalDistribution(double x) {
        double t = 1 / (1 + 0.2316419 * Math.abs(x));
        double d = 0.3989423 * Math.exp(-x * x / 2);
        double prob = d * t * (0.319381530 + t * (-0.356563782 + t * (1.781477937 + t * (-1.821255978 + t * 1.330274429))));
        if (x > 0) {
            prob = 1 - prob;
        }
        return prob;
    }
}
