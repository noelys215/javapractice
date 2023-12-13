package dev.lpa;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;
        Trackable truck = new Truck();


        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);
        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        System.out.println(" ");
        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);
        System.out.println(" ");
        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) tracked.track();
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) flier.takeOff();
    }

    private static void flyFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) flier.fly();
    }

    private static void landFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) flier.land();
    }
}
