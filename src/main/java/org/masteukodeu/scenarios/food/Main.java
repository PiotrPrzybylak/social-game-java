package org.masteukodeu.scenarios.food;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            World.INSTANCE.places.add(new Place());
        }
        Place startPlace = World.INSTANCE.places.get(5);
        Human human = new Human(startPlace);
        for (int i = 0; i < 10; i++) {
            for (Place place : World.INSTANCE.places) {
                place.growFood();
            }
            human.live();
            System.out.println(human);
            System.out.println(World.INSTANCE);
        }
    }
}
