package dev.lpa;

public class Cat extends Animal implements AnimalStuff {
    @Override
    public void makeNoise() {
        System.out.println("Nya");
    }

    @Override
    public void poop() {
        System.out.println(name + " defecates...");
    }
}
