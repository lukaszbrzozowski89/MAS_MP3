/*
 * Copyright (c) Łukasz Brzozowski s17174 @ PJATK
 */

public class Midfielder extends Player {
    private int assists;
    private int goals;

    public Midfielder(String name, String surname, String team, int goals, int assists) {
        super(name, surname, team);
        this.goals = goals;
        this.assists = assists;
    }

    @Override
    public int getImportantStats() {
        return getAssists();
    }

    @Override
    public int getSecondaryStats() {
        return getGoals();
    }

    public int getAssists() {
        return assists;
    }

    public int getGoals() {
        return goals;
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

    @Override
    public double getSalary() {
        return 0;
    }
}
