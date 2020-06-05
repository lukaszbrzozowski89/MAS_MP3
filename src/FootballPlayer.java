public abstract class FootballPlayer extends ObjectPlusPlus {
    private String name;
    private String surname;


    public FootballPlayer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void pass();

    public abstract void kick();

    public abstract void shoot();

    public abstract void throwBall();

    public abstract int getImportantStats();

    public abstract int getSecondaryStats();

    @Override
    public String toString() {
        return name + " "
                + surname + " ";
    }
}
