package org.masteukodeu.scenarios.food;

public class Human {

    private Place place;
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
            return;
        }

        move();
    }

    private void move() {
        int index = World.INSTANCE.places.indexOf(place);
        index += Direction.randomDirection().delta;
        if (index >= 0 && index < World.INSTANCE.places.size()) {
            place = World.INSTANCE.places.get(index);
        }
    }

    private void eat(int food) {
        foodInBellyInKCal += food;
        foodInBellyInKCal = Math.min(foodInBellyInKCal, 3000);
    }

    @Override
    public String toString() {
        return "Human{" +
                "place=" + place +
                ", alive=" + alive +
                ", foodInBellyInKCal=" + foodInBellyInKCal +
                '}';
    }
}
