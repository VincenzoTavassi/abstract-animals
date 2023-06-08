package org.learning.java.animals;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

//    METHODS

    public abstract void verso();
    public abstract void mangia();
    public void dormi() {
        System.out.println("ZzzzzZzzz");
    }

    public static void faiVolare(CanFly animal) {
        animal.fly();
    }

    public static void faiNuotare(CanSwim animal) {
        animal.swim();
    }

    public String getName() {
        return name;
    }
}
