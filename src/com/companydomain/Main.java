package com.companydomain;

import com.mortgagecalculator.MortgageCalculator;


public class Main {

    public static void main(String[] args) {
        System.out.println("Time to calculate your mortgage!");
        System.out.println("Please enter the following below:");

        MortgageCalculator mortgageCalculator = new MortgageCalculator();

        mortgageCalculator.calculateMortgage();
    }
}
