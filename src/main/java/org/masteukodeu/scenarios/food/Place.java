package org.masteukodeu.scenarios.food;

public class Place {

    int foodInKCal;

    public void growFood() {
        if (foodInKCal < 5000) {
            if (World.checkWithProbability(25)) {
                foodInKCal += 1000;
            }
        }
    }

    public int harvestFood() {
        int harvesterFood = foodInKCal;
        foodInKCal = 0;
        return harvesterFood;
    }

    @Override
    public String toString() {
        return "Place{" +
                "index=" + World.INSTANCE.places.indexOf(this) +
                ", foodInKCal=" + foodInKCal +
                '}';
    }
}
