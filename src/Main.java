public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int year = 1;
        int cost = 100_000_000;
        double percent = 9.9;
        double payment = service.calculate(year, cost, percent);
        System.out.println("Ежемесячный платеж: " + payment);
    }
}
