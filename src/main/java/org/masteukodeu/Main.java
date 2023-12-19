package org.masteukodeu;


public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        Human human = new Human();
        System.out.println(human);
        for (int i = 0; i < 365*100; i++) {
            human.live();
            System.out.println(human);
        }
    }
}