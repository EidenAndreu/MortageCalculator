import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner principal = new Scanner(System.in);
        System.out.print("Principal (€): ");
        double principalAmount = principal.nextDouble();

        Scanner r = new Scanner(System.in);
        System.out.print("Interest rate (%): ");
        double interestRate = r.nextDouble();

        Scanner n = new Scanner(System.in);
        System.out.print("Number of years: ");
        int numberOfYears = n.nextInt();

        double monthlyInterestRate = interestRate / 100 / 12;
        double months = numberOfYears * 12;

        double monthlyPaymentAmount = principalAmount * ((monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, months))) / (Math.pow((1 + monthlyInterestRate), months) - 1));

        System.out.println("The monthly payment is: " + Math.round(monthlyPaymentAmount) + "€");
    }
}