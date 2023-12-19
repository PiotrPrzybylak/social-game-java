package org.masteukodeu;

import java.util.ArrayList;

public class Human {
    private int ageInDays;
    private boolean alive = true;

    public void live() {
        if (!alive) {
            return;
        }
        ageInDays++;

        if (ageInYears() >= 100) {
            die();
            return;
        }

        if (ageInYears() >= 18 &&  ageInYears() < 60 && hasBirthday() && World.INSTANCE.random.nextInt(50) == 0) {
            bud();
        }

    }

    private void die() {
        alive = false;
        World.INSTANCE.population.remove(this);
    }

    private void bud() {
        World.INSTANCE.population.add(new Human());
    }

    private boolean hasBirthday() {
        return ageInDays % 365 == 0;
    }

    private int ageInYears() {
        return ageInDays / 365;
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
