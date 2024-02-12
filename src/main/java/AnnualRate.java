public class AnnualRate {
    public static void main(String[] args) {
        int amount = 2500;
        int period = 12;
        int monthlyFee = calculateMonthlyFee(amount, period);
        System.out.println("Monthly Fee: " + monthlyFee);

        double annualRate = 0.07; // 7% annual rate
        double totalAmount = calculateTotalAmount(amount, period, annualRate);
        System.out.println("Total Amount for 12 Months: " + totalAmount);
    }
    public static int calculateMonthlyFee(int amount, int period) {
        return amount / period; // Monthly fee calculation
    }
    public static double calculateTotalAmount(int amount, int period, double annualRate) {
        double monthlyFee = calculateMonthlyFee(amount, period);
        double totalAmount = monthlyFee * period; // Total amount without annual rate
        double rateAmount = totalAmount * annualRate; // Amount for the annual rate
        return totalAmount + rateAmount; // Total amount with annual rate
    }
}