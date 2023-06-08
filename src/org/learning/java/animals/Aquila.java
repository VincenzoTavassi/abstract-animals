package org.learning.java.animals;

public class Aquila extends Animal implements CanFly {

    public Aquila(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Screek Screek");
    }

    @Override
    public void mangia() {
        System.out.println("sto mangiando carne..");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!");
    }
}
