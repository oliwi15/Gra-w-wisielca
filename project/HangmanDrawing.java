import javafx.scene.control.Label;

public class HangmanDrawing extends Label {
    public HangmanDrawing() {
        super();
    }

    public void draw(int wrongCount) {
        StringBuilder hangman = new StringBuilder();
        switch (wrongCount) {
            case 1:
                hangman.append("|").append("\n|").append("\n|").append("\n|");
                break;
            case 2:
                hangman.append("_ _ _ _").append("\n|").append("\n|").append("\n|").append("\n|");
                break;
            case 3:
                hangman.append("_ _ _ _").append("\n|      |").append("\n|").append("\n|").append("\n|");
                break;
            case 4:
                hangman.append("_ _ _ _").append("\n|      |").append("\n|      O").append("\n|").append("\n|");
                break;
            case 5:
                hangman.append("_ _ _ _").append("\n|      |").append("\n|      O").append("\n|      |").append("\n|");
                break;
            case 6:
                hangman.append("_ _ _ _").append("\n|      |").append("\n|      O").append("\n|     /|").append("\n|");
                break;
            case 7:
                hangman.append("_ _ _ _").append("\n|      |").append("\n|      O").append("\n|     /|\\")
                        .append("\n|");
                break;
            case 8:
                hangman.append("_ _ _ _").append("\n|      |").append("\n|      O").append("\n|     /|\\")
                        .append("\n|     /");
                break;
            case 9:
                hangman.append("_ _ _ _").append("\n|      |").append("\n|      O").append("\n|     /|\\")
                        .append("\n|     / \\");
                break;
            default:
                hangman.append("|").append("\n|").append("\n|").append("\n|");
                break;
        }
        this.setText(hangman.toString());
    }

    public void clear() {
        this.setText("");
    }
}
