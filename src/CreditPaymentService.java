public class CreditPaymentService {

    public double calculate(int year, int cost, double percent) {
        double p = percent / 100 / 12;
        int n = year * 12;
        double formula = cost * (p + (p / (Math.pow(n - 1, 1 + p))));
        return formula;
    }
}
