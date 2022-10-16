package com.ahmad;

public class MortgageCalculator {
    public final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    private int principal;
    private float annualInterest;
    private byte years;

    // Constructor
    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public byte getYears() {
        return  years;
    }

    // Calculating Balance
    public double calcBalance(int numberOfPaymentsMade) {
        int numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments));

        return balance;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    // Calculating Mortgage
    public double calcMortgage() {

        int numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();

        double mortage = principal * (monthlyInterest
                * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortage;
    }
}
