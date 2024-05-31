
public class Game {
    private String word;
    private StringBuilder guessedWord;
    private int attempts;
    private Stats stats;
    private boolean gameEnded;

    public Game(String word, Stats stats) {
        this.word = word;
        this.guessedWord = new StringBuilder("_".repeat(word.length()));
        this.attempts = 0;
        this.stats = stats;
        this.gameEnded = false;
    }

    public boolean guess(char letter) {
        boolean correct = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedWord.setCharAt(i, letter);
                correct = true;
            }
        }
        attempts++;
        if (!gameEnded) {
            if (correct && isComplete()) {
                stats.incrementWins();
                gameEnded = true;
            } else if (attempts >= 10) {
                stats.incrementLosses();
                gameEnded = true;
            }
        }
        return correct;
    }

    public boolean isComplete() {
        return guessedWord.toString().equals(word);
    }

    public String getGuessedWord() {
        return guessedWord.toString();
    }

    public int getAttempts() {
        return attempts;
    }

    public String getWord() {
        return word;
    }
}
