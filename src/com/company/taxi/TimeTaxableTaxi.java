package com.company.taxi;

/**
 * Time-taxable taxi
 *
 * (c) Yaroslav Kasperovych
 * MIT License
 */

public class TimeTaxableTaxi extends Taxi {
    private int minutes;

    public TimeTaxableTaxi() {}

    public TimeTaxableTaxi(int  minutes) {
        this.minutes = minutes;
    }

    public TimeTaxableTaxi(String manufacturer, double rate, int minutes) {
        this.setManufacturer(manufacturer);
        this.setRate(rate);
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public double getSalary() {
        return this.getRate() * this.getMinutes();
    }

    @Override
    public String toString() {
        return "TimeTaxableTaxi{" +
                "manufacturer=" + getManufacturer() + ", " +
                "minutes=" + minutes +
                '}';
    }
}
