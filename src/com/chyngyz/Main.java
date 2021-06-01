package com.chyngyz;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2019(100_000);
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2018(5000));
    }
}
