package org.masteukodeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum World {
    INSTANCE;

    public final List<Human> population = new ArrayList<>();
    public final Random random = new Random();

    public int multiplicationFactor = 50;
}
