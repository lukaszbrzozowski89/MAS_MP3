/*
 * Copyright (c) Łukasz Brzozowski s17174 @ PJATK
 */

public abstract class Player extends Person {

    private String team;

    public Player(String name, String surname, String team) {
        super(name, surname);
        this.team = team;
    }

    public abstract void pass();

    public abstract void shoot();

    public abstract void throwBall();

    public abstract int getImportantStats();

    public abstract int getSecondaryStats();


    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return super.toString() + " z drużyny " + team + " ";
    }
}
