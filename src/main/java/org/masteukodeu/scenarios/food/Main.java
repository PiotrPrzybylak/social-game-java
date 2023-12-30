package org.masteukodeu.scenarios.food;

public class Main {
    public static void main(String[] args) {
        Place place = new Place();
        Human human = new Human(place);
        System.out.println(human);
        human.live();
        place.growFood();
        System.out.println(human);
        human.live();
        System.out.println(human);
        human.live();
        System.out.println(human);
        human.live();
        System.out.println(human);
        human.live();
        System.out.println(human);
    }
}
