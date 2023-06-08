package org.learning.java.animals;

public class Passerotto extends Animal implements CanFly {

    public Passerotto(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Cip cip");
    }

    @Override
    public void mangia() {
        System.out.println("sto mangiando un verme..");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!");
    }
}
