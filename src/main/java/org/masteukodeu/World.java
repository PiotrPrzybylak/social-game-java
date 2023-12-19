package org.masteukodeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum World {
    INSTANCE;

    public List<Human> population = new ArrayList<>();
    public Random random = new Random();

}
