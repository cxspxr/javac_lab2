package com.company.taxi;

/**
 * Generic abstract taxi
 *
 * (c) Yaroslav Kasperovych
 * MIT License
 */

public abstract class Taxi implements ITaxable {
    private String manufacturer;
    private double rate;

    public Taxi() {}

    public Taxi(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Taxi(String manufacturer, double rate) {
        this.manufacturer = manufacturer;
        this.rate = rate;
    }

    public Taxi(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "manufacturer='" + manufacturer + '\'' +
                ", rate=" + rate +
                '}';
    }
}
