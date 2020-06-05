public class Midfielder extends FootballPlayer {
    private int assists;
    private int goals;

    public Midfielder(String name, String surname, int goals, int assists) {
        super(name, surname);
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

}
