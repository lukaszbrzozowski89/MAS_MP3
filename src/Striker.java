public class Striker extends FootballPlayer {
    private int goals;
    private int assists;

    public Striker(String name, String surname, int goals, int assists) {
        super(name, surname);
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
        System.out.println(this + "pass ball");
    }

    @Override
    public void kick() {
        System.out.println(this + "kick ball");
    }

    @Override
    public void shoot() {
        System.out.println(this + "shoot ball");
    }

    @Override
    public void throwBall() {
        System.out.println(this + "throw ball");
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

}
