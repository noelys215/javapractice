package dev.lpa;

public class Bird extends Animal implements FlightEnabled, Trackable {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

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
}
