package org.masteukodeu;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        Human adam = new Human();
        System.out.println(adam);
        World.INSTANCE.population.add(adam);
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 365; j++) {
                for (Human human : new ArrayList<>(World.INSTANCE.population)) {
                    human.live();
                }
            }
            System.out.print("Year " + i + " : ");
            int population = World.INSTANCE.population.size();
            System.out.println(population);
            if (population == 0 || population > 1000) {
                System.out.println("Game over!");
                System.out.println("Your civilization lasted " + i + " years");
                return;
            }
        }
    }
}