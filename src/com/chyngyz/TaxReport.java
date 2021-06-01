package com.chyngyz;

/**
 * Created by Chyngyz on 10/1/2018.
 */

public class TaxReport {

    private TaxCalculator calculator;

    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
