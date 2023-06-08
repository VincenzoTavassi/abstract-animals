package org.learning.java.animals;

public class Cane extends Animal implements CanSwim {
    public Cane(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Woof woof");
    }

    @Override
    public void mangia() {
        System.out.println("sto mangiando carne..");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando!");
    }
}
