package com.chyngyz;

/**
 * Created by Chyngyz on 10/1/2018.
 */

public class TaxCalculator2019 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2019(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
