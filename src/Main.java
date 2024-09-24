public class CreditCardInterest {
    public static void main(String[] args) {
        double balance = 5000.0; // Initial credit card balance
        double interestRate = 0.17; // Annual interest rate
        double monthlyInterestRate = interestRate / 12; // Monthly interest rate


        double interestAfterOneMonth = balance * monthlyInterestRate;


        double newBalanceAfterOneMonth = balance + interestAfterOneMonth;


        double interestAfterTwoMonths = newBalanceAfterOneMonth * monthlyInterestRate;


        System.out.printf("Initial Balance: 5000, balance);
        System.out.printf("Interest due after one month: x ", interestAfterOneMonth);
        System.out.printf("Balance after one month: $x", newBalanceAfterOneMonth);
        System.out.printf("Interest due after two months: $x", interestAfterTwoMonths);