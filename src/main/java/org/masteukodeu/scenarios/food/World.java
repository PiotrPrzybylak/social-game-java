package org.masteukodeu.scenarios.food;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum World {
    INSTANCE;
    public final Random random = new Random();

    public final List<Place> places = new ArrayList<>();

    public static boolean checkWithProbability(int probabilityInPercents) {
        return INSTANCE.random.nextInt(100) < probabilityInPercents;
    }

    @Override
    public String toString() {
        return "{" + places + '}';
    }
}