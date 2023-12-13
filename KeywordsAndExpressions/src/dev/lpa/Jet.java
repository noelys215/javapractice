package dev.lpa;

public class Jet implements FlightEnabled, Trackable {
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " Takes Off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " Lands");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " Flies");
    }

    @Override
    public void track() {
        System.out.println("Tracking " + getClass().getSimpleName());
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");
        return FlightEnabled.super.transition(stage);
    }
}
