package org.masteukodeu;

public class Human {
    private int ageInDays;
    private boolean alive = true;

    public void live() {
        if (alive) {
            ageInDays++;
        }
        if (ageInDays >= 365*100) {
            alive = false;
        }
    }
    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        return "Human{" +
                "ageInDays=" + ageInDays +
                ", alive=" + alive +
                '}';
    }
}
