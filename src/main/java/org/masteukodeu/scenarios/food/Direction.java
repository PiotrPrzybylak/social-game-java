package org.masteukodeu.scenarios.food;

public enum Direction {

    BACK(-1), FORWARD(1), STAY(0);
    final int delta;

    Direction(int delta) {
        this.delta = delta;
    }

    public static Direction randomDirection()  {
        Direction[] directions = values();
        return directions[World.INSTANCE.random.nextInt(directions.length)];
    }
}
