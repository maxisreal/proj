public class Game {
    private String gameName;
    private int players;
    private int score;

    public Game(String gameName, int players) {
        score = 0;
        this.gameName = gameName;
        this.players = players;
    }
    public String getGameName() {
        return gameName;
    }
    public int getScore() {
        return score;
    }
    public int getPlayers() {
        return players;
    }
    public void addPlayer() {
        players++;
    }
    public void increaseScore(int increase) {
        score += increase;
    }
    public double averageScorePerPlayer() {
        return score*1.0/players;
    }
    public boolean isGameOver() {
        return (score > 9);
    }
}
