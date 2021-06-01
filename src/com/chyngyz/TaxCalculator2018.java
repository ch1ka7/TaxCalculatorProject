package com.chyngyz;

/**
 * Created by Chyngyz on 10/1/2018.
 */

public class TaxCalculator2018 extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.25;
    }
}
