package org.masteukodeu.scenarios.food;

public class Human {

    boolean alive = true;
    int foodInBellyInKCal = 3000;

    public void live() {
        if (!alive) {
            return;
        }
        foodInBellyInKCal -= 1000;
        if (foodInBellyInKCal < 0) {
            alive = false;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "alive=" + alive +
                ", foodInBellyInKCal=" + foodInBellyInKCal +
                '}';
    }
}
