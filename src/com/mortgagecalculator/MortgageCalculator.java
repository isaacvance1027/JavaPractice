package com.mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    protected final byte MONTHS_IN_YEAR = 12;
    protected final byte PERCENT = 100;

    public void calculateMortgage(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double monthlyRate = (scanner.nextDouble()/PERCENT)/MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int payments = scanner.nextInt()*MONTHS_IN_YEAR;

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("Mortgage: ");
        System.out.println(currency.format(mortgageFunction(principal, monthlyRate, payments)));
    }

    public double mortgageFunction(double P, double r, int n){
        return P * ((r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1));
    }
}
