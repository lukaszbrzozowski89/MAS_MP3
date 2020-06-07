/*
 * Copyright (c) Łukasz Brzozowski s17174 @ PJATK
 */

public class Striker extends Player {
    private int goals;
    private int assists;

    public Striker(String name, String surname, String team, int goals, int assists) {
        super(name, surname, team);
        this.goals = goals;
        this.assists = assists;
    }

    @Override
    public int getImportantStats() {
        return getGoals();
    }

    @Override
    public int getSecondaryStats() {
        return getAssists();
    }

    @Override
    public void pass() {
        System.out.println(this + "podal piłkę");
    }

    @Override
    public void shoot() {
        System.out.println(this + "oddał strzał");
    }

    @Override
    public void throwBall() {
        System.out.println(this + "rzucił piłkę");
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
