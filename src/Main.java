public class Main {

    public static void main(String[] args) {
        polymorphismTest();
    }

    public static void polymorphismTest() {
        System.out.println("-------------------------------");
        FootballPlayer midfielder = new Midfielder("Frank", "Lampard", 24, 21);
        FootballPlayer striker = new Striker("Didier", "Drogba", 15, 8);

        midfielder.kick();
        striker.kick();
        midfielder.pass();
        striker.pass();
        midfielder.shoot();
        striker.shoot();
        midfielder.throwBall();
        striker.throwBall();
        System.out.println("\nImportant stats for player position");
        System.out.println(midfielder + " Assists: " + midfielder.getImportantStats());
        System.out.println(striker + " Goals: " + striker.getImportantStats());
        System.out.println("\nSecondary stats for player position");
        System.out.println(midfielder + " Goals: " + midfielder.getSecondaryStats());
        System.out.println(striker + " Assists: " + striker.getSecondaryStats());
    }
}
