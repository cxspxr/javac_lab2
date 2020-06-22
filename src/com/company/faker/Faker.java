package com.company.faker;

import java.util.Random;

/**
 * Fake data generator
 *
 * (c) Yaroslav Kasperovych
 * MIT License
 */

public class Faker {
    private static String[] manufacturers = {"BMW", "Daewoo", "Audi", "Lamborghini", "Pagani", "Mazeratti", "Ferrari"};
    private static double minimumRate = 50;
    private static int minimumMinutes = 15;
    private static double minimumKilometers = 3;
    private static Random rng = new Random();

    public static String getManufacturer() {
        return manufacturers[rng.nextInt(manufacturers.length)];
    }

    public static double getRate() {
        return minimumRate + minimumRate * rng.nextDouble();
    }

    public static int getMinutes() {
        return minimumMinutes + minimumMinutes * rng.nextInt(3);
    }

    public static double getKilometers() {
        return minimumKilometers + minimumKilometers * rng.nextDouble();
    }
}
