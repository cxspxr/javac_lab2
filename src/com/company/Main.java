package com.company;

import com.company.faker.Faker;
import com.company.taxi.DistanceTaxableTaxi;
import com.company.taxi.TimeTaxableTaxi;
import com.company.taxi.ITaxable;
import com.company.taxi.Taxi;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * Program entry point
 *
 * (c) Yaroslav Kasperovych
 * MIT License
 */

public class Main {
    private static LinkedList<Taxi> taxiList = new LinkedList<>();

    public static void main(String[] args) {
        populateTaxiList();

        System.out.println(String.format("Total salary of all taxi are %s", getTotalSalary()));
        System.out.println(String.format("Lowest salary taxi is %s", getLowestSalaryTaxi()));
        System.out.println(String.format("Highest salary taxi is %s", getHighestSalaryTaxi()));
        System.out.println(String.format("Average salary among all taxi types is %s", getAverageSalary()));
        System.out.println(String.format("Distance-taxable taxi total salary is %s", getDistanceTaxiTotalSalary()));
        System.out.println(String.format("Time-taxable taxi total salary is %s", getTimeTaxiTotalSalary()));
    }

    private static void populateTaxiList() {
        for (int timeTaxableTaxiCount = 0; timeTaxableTaxiCount < 10; timeTaxableTaxiCount++) {
            taxiList.add(new TimeTaxableTaxi(Faker.getManufacturer(), Faker.getRate() / 10, Faker.getMinutes()));
        }

        for (int distanceTaxableCount = 0; distanceTaxableCount < 5; distanceTaxableCount++) {
            taxiList.add(new DistanceTaxableTaxi(Faker.getManufacturer(), Faker.getRate(), Faker.getKilometers()));
        }
    }

    private static double getTotalSalary() {
        return taxiList.stream().mapToDouble(ITaxable::getSalary).sum();
    }

    private static Taxi getLowestSalaryTaxi() {
        return taxiList
                .stream()
                .min(Comparator.comparingDouble(ITaxable::getSalary))
                .orElse(null);
    }

    private static Taxi getHighestSalaryTaxi() {
        return taxiList
                .stream()
                .max(Comparator.comparingDouble(ITaxable::getSalary))
                .orElse(null);
    }

    private static double getAverageSalary() {
        return taxiList.stream().mapToDouble(ITaxable::getSalary).average().orElse(0);
    }

    private static double getDistanceTaxiTotalSalary() {
        return taxiList
                .stream()
                .filter(taxi -> taxi instanceof DistanceTaxableTaxi)
                .mapToDouble(ITaxable::getSalary)
                .sum();
    }

    private static double getTimeTaxiTotalSalary() {
        return taxiList
                .stream()
                .filter(taxi -> taxi instanceof TimeTaxableTaxi)
                .mapToDouble(ITaxable::getSalary)
                .sum();
    }
}
