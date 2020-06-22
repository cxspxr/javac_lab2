package com.company.taxi;

/**
 * Distance-taxable taxi
 *
 * (c) Yaroslav Kasperovych
 * MIT License
 */

public class DistanceTaxableTaxi extends Taxi {
    private double kilometers;

    public DistanceTaxableTaxi() {}

    public DistanceTaxableTaxi(double  kilometers) {
        this.kilometers = kilometers;
    }

    public DistanceTaxableTaxi(String manufacturer, double rate, double kilometers) {
        this.setManufacturer(manufacturer);
        this.setRate(rate);
        this.kilometers = kilometers;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public double getSalary() {
        return this.getRate() * this.getKilometers();
    }

    @Override
    public String toString() {
        return "DistanceTaxableTaxi{" +
                "manufacturer=" + getManufacturer() + ", " +
                "kilometers=" + kilometers +
                '}';
    }

}
