package com.chyngyz;

/**
 * Created by Chyngyz on 10/1/2018.
 */

public abstract class AbstractTaxCalculator implements TaxCalculator {
    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
