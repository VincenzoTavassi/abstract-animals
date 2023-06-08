package org.learning.java.animals;

public class Delfino extends Animal implements CanSwim {
    public Delfino(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Creek creeek");
    }

    @Override
    public void mangia() {
        System.out.println("sto mangiando pesce..");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando!");
    }
}
