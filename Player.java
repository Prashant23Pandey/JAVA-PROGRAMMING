class Player {
    String playerName;
    int runsScored;
    int matchesPlayed;
    int wicketsTaken;
    Player(String playerName, int runsScored, int matchesPlayed, int wicketsTaken) {
        this.playerName = playerName;
        this.runsScored = runsScored;
        this.matchesPlayed = matchesPlayed;
        this.wicketsTaken = wicketsTaken;
    }
    void displayInfo() {
        System.out.println("Player Name   : " + playerName);
        System.out.println("Runs Scored  : " + runsScored);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Wickets Taken : " + wicketsTaken);
        System.out.println();
    }
    double averageRuns() {
        if (matchesPlayed == 0)
            return 0;
        return (double) runsScored / matchesPlayed;
    }
}
public class PlayerDemo {
    public static void main(String[] args) {
        Player p1 = new Player("Virat Kohli", 13848, 295, 5);
        Player p2 = new Player("Jasprit Bumrah", 1200, 90, 149);
        System.out.println("Player Details:");
        p1.displayInfo();
        p2.displayInfo();
        System.out.println("Player with Highest Wickets:");
        if (p1.wicketsTaken > p2.wicketsTaken)
            p1.displayInfo();
        else
            p2.displayInfo();
        System.out.println("Player with Highest Runs:");
        if (p1.runsScored > p2.runsScored)
            p1.displayInfo();
        else
            p2.displayInfo();
        System.out.println("Average Runs Per Match:");
        System.out.printf("%s : %.2f%n", p1.playerName, p1.averageRuns());
        System.out.printf("%s : %.2f%n", p2.playerName, p2.averageRuns());
    }
}
