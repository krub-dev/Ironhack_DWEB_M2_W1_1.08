package org.example;
import org.example.bigdecimal.BigDecimalOps;
import org.example.carinventory.Car;
import org.example.carinventory.typecar.*;
import org.example.videostreaming.typevideo.Movie;
import org.example.videostreaming.typevideo.TvSeries;
import org.example.inlist.IntList;
import org.example.inlist.implementations.IntArrayList;
import org.example.inlist.implementations.IntVector;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // 1. BigDecimalOps
        System.out.println("== BigDecimal ==");
        BigDecimal bd1 = new BigDecimal("4.2545");
        BigDecimal bd2 = new BigDecimal("-45.67");
        System.out.println("Rounded to 2 decimals: " + BigDecimalOps.roundTo2Decimals(bd1));
        System.out.println("Reversed and rounded 1 to decimal: " + BigDecimalOps.invertSignAndRoundTo1Decimals(bd1));
        System.out.println("Reversed and rounded 1 to decimal: " + BigDecimalOps.invertSignAndRoundTo1Decimals(bd2));
        System.out.println();

        // 2. Car Inventory
        System.out.println("== Car Inventory ==");
        Car sedan = new Sedan("VIN123", "Toyota", "Camry", 50000);
        Car suv = new UtilityVehicle("VIN456", "Jeep", "Wrangler", 30000, true);
        Car truck = new Truck("VIN789", "Ford", "F-150", 40000, 3500.5);
        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
        System.out.println();

        // 3. Video Streaming
        System.out.println("== Video Streaming ==");
        Movie movie = new Movie("Inception", 148, 8.8);
        TvSeries series = new TvSeries("Breaking Bad", 62, 45);
        System.out.println(movie.getInfo());
        System.out.println(series.getInfo());
        System.out.println();

        // 4. IntList
        System.out.println("== IntArrayList ==");
        IntList intArrayList = new IntArrayList();
        for (int i = 0; i < 12; i++) {
            intArrayList.add(i * 2);
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(intArrayList.get(i) + " ");
        }
        System.out.println();

        System.out.println("== IntVector ==");
        IntList intVector = new IntVector();
        for (int i = 0; i < 25; i++) {
            intVector.add(i + 1);
        }
        for (int i = 0; i < 25; i++) {
            System.out.print(intVector.get(i) + " ");
        }

        System.out.println();
    }
}
