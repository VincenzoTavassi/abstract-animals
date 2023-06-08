package org.learning.java.animals;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane("Tom");
        cane.mangia();
        cane.verso();
        cane.dormi();
        Aquila gina = new Aquila("Gina");
        gina.mangia();
        gina.verso();
        gina.dormi();

        gina.fly();
        cane.swim();

        Animal.faiNuotare(cane);
        Animal.faiVolare(gina);
    }
}
