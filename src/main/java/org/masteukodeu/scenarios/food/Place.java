package org.masteukodeu.scenarios.food;

public class Place {

    int foodInKCal;

    Human human;

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

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {

        String human = this.human != null ? " *" : "";
        return "[" +
                World.INSTANCE.places.indexOf(this) +
                "=" + foodInKCal/1000 +
                human +
                "]";
    }
}
