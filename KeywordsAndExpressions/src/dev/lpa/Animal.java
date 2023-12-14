package dev.lpa;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) System.out.println("Monitoring" + this);
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {
    FlightStages stage = FlightStages.GROUNDED;


    public void achievedOrbit() {
        transition("Orbit Achieved");
    }

    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achievedOrbit();
        transition("Orbiting");
    }

    public void transition(String desc) {
        System.out.println(desc);
        stage = transition(stage);
        stage.track();
    }
}


interface OrbitEarth extends FlightEnabled {
    void achievedOrbit();

    private static void log(String desc) {
        var today = new java.util.Date();
        System.out.println(today + ": " + desc);
    }

    private void logStage(FlightStages stage, String desc) {
        desc = stage + ": " + desc;
        log(desc);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Start Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    public abstract void takeOff();

    abstract void land();

    void fly();

    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = stage.getNextStage();
        System.out.println("From: " + stage + " to " + nextStage);
        return nextStage;
    }

}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}



