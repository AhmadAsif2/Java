import java.text.NumberFormat;
import java.util.Scanner;

public class Mortage {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    static Scanner scanner = new Scanner(System.in);

    // Main Method
    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest: ", 0, 30);
        byte years = (byte) readNumber("Years: ", 0, 30);

        printMortgage(principal, annualInterest, years);
        printPayementSchedule(principal, annualInterest, years);
        scanner.close();
    }

    // Printing Mortgage
    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calcMortgage(principal, annualInterest, years);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage");
        System.out.println("-------------------");
        System.out.println("Mortgage: " + mortageFormatted);
    }

    // // Prinitng Payment Schedule
    private static void printPayementSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("--------------------");
        for (short months = 1; months <= years * MONTHS_IN_YEAR; months++) {
            double balance = calcBalance(principal, annualInterest, years, months);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    // Validating Number
    public static double readNumber(
            String prompt,
            double min,
            double max) {
        double value = 0;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value > min && value < max)
                break;
            System.out.println("Enter a value between " + min + " " + max);
        }
        return value;
    }

    // Calculating Balance
    public static double calcBalance(
            int principal,
            float annualInterest,
            byte years,
            int numberOfPaymentsMade) {
        int numberOfPayments = years * MONTHS_IN_YEAR;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                        - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments));

        return balance;
    }

    // Calculating Mortgage
    public static double calcMortgage(
            int principal,
            float annualInterest,
            byte years) {

        int numberOfPayments = years * MONTHS_IN_YEAR;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double mortage = principal * (monthlyInterest
                * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortage;
    }
}