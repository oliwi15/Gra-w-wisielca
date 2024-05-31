public class Stats {
    private int wins;
    private int losses;

    public void incrementWins() {
        wins++;
    }

    public void incrementLosses() {
        losses++;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTotalGames() {
        return wins + losses;
    }

    @Override
    public String toString() {
        return "Wygrane: " + wins + ", Przegrane: " + losses + ", Próby: " + getTotalGames();
    }
}
