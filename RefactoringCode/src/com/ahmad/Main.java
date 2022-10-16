package com.ahmad;

public class Main {
    // Main Method
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest: ", 0, 30);
        byte years = (byte) Console.readNumber("Years: ", 0, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var mortgage = new MortgageReport(calculator);
        mortgage.printMortgage();
        mortgage.printPaymentSchedule();
    }
}
