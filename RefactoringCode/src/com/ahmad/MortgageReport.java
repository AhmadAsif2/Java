package com.ahmad;

import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator =calculator;
    }
    // Printing Mortgage
    public void printMortgage() {
        double mortgage = calculator.calcMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage");
        System.out.println("-------------------");
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    // // Printing Payment Schedule
    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("--------------------");
        for (short months = 1; months <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; months++) {
            double balance = calculator.calcBalance(months);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
