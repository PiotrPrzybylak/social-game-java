package org.masteukodeu.scenarios.food;

public class Human {

    private final Place place;
    boolean alive = true;
    int foodInBellyInKCal = 3000;

    public Human(Place place) {
        this.place = place;
    }

    public void live() {
        if (!alive) {
            return;
        }
        int harvestedFood = place.harvestFood();
        eat(harvestedFood);
        foodInBellyInKCal -= 1000;
        if (foodInBellyInKCal < 0) {
            alive = false;
        }
    }

    private void eat(int food) {
        foodInBellyInKCal += food;
        foodInBellyInKCal = Math.min(foodInBellyInKCal, 3000);
    }

    @Override
    public String toString() {
        return "Human{" +
                "alive=" + alive +
                ", foodInBellyInKCal=" + foodInBellyInKCal +
                '}';
    }
}
