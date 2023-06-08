package org.learning.java.animals;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Seleziona il numero di animali");
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        Animal[] animals = new Animal[number];

        for (int i = 0; i < animals.length; i++) {
            int randomNumber = random.nextInt(1,5);
            switch (randomNumber) {
                case 1 -> animals[i] = new Aquila("Aquila " + i);
                case 2 -> animals[i] = new Cane("Cane " + i);
                case 3 -> animals[i] = new Delfino("Delfino " + i);
                case 4 -> animals[i] = new Passerotto("Passerotto " + i);
            }
        }

        for (Animal animal : animals) {
            System.out.println("Sono " + animal.getName());
            animal.mangia();
            animal.verso();
            if (animal instanceof CanFly) Animal.faiVolare((CanFly) animal);
            else if (animal instanceof CanSwim) Animal.faiNuotare((CanSwim) animal);
            animal.dormi();
        }

        }
    }
