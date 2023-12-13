package dev.lpa;

public class Truck implements Trackable {
    @Override
    public void track() {
        System.out.println("Tracking " + getClass().getSimpleName());
    }
}
