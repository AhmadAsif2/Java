package com.ahmad;

// Encapsulating Data (Encapsulation)
public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public int extraHours;

    // Static Field
    public static int numberofEmployees;

    //Constructor Overloading
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    // Constructor
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberofEmployees++;
    }

    // Static Method
    public static void print() {
        System.out.println(numberofEmployees);
    }

//    Setters
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salry cannot be less than or equal to 0");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be less than or equal to 0");
        this.hourlyRate = hourlyRate;
    }
//  getters
    private int getHourlyRate() {
        return hourlyRate;
    }

    // Method Overloading
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // Method Overloading
    public int calculateWage() {
        return baseSalary;
    }
}
