import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class UI extends Application {
    private Game game;
    private WordDatabase wordDatabase;
    private Stats stats;
    private Label wordLabel;
    private TextField inputField;
    private TextArea messageArea;
    private String currentDifficulty;
    private String wrongLetters;
    private HangmanDrawing hangmanDrawing;
    private Button replayButton;
    private VBox initialLayout;

    @Override
    public void start(Stage primaryStage) {
        wordDatabase = new WordDatabase();
        stats = new Stats();
        wrongLetters = "";

        primaryStage.setTitle("Gra w Wisielca");

        initialLayout = new VBox();
        initialLayout.setPadding(new Insets(10));
        initialLayout.setSpacing(10);

        Button startGameButton = new Button("Rozpocznij grę");
        Button statsButton = new Button("Statystyki");

        initialLayout.getChildren().addAll(startGameButton, statsButton);

        Button easyButton = new Button("Łatwy");
        Button mediumButton = new Button("Średni");
        Button hardButton = new Button("Trudny");

        wordLabel = new Label();
        inputField = new TextField();
        inputField.setPromptText("Wprowadź literę");
        messageArea = new TextArea();
        messageArea.setEditable(false);
        messageArea.setWrapText(true);
        hangmanDrawing = new HangmanDrawing();
        hangmanDrawing.setPrefHeight(200);
        replayButton = new Button("Zagraj ponownie");

        replayButton.setOnAction(e -> {
            initialLayout.getChildren().clear();
            initialLayout.getChildren().addAll(startGameButton, statsButton);
            replayButton.setVisible(false);
        });
        replayButton.setVisible(false);

        startGameButton.setOnAction(e -> {
            initialLayout.getChildren().removeAll(easyButton, mediumButton, hardButton, wordLabel, inputField,
                    messageArea, hangmanDrawing);
            initialLayout.getChildren().addAll(easyButton, mediumButton, hardButton, hangmanDrawing);
        });

        statsButton.setOnAction(e -> {
            initialLayout.getChildren().clear();
            Label statsLabel = new Label(stats.toString());
            initialLayout.getChildren().addAll(startGameButton, statsButton, statsLabel);
        });

        easyButton.setOnAction(e -> startGame(primaryStage, "Łatwy"));
        mediumButton.setOnAction(e -> startGame(primaryStage, "Średni"));
        hardButton.setOnAction(e -> startGame(primaryStage, "Trudny"));

        inputField.setOnAction(e -> {
            String input = inputField.getText();
            if (input.length() == 1) {
                char guess = input.charAt(0);
                if (!game.guess(guess)) {
                    wrongLetters += guess + ", ";
                    messageArea.setText("Zła litera! Użyłeś już: " + wrongLetters);
                    hangmanDrawing.draw(game.getAttempts());
                }
                updateGame();
            }
            inputField.clear();
        });

        Scene scene = new Scene(initialLayout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startGame(Stage primaryStage, String difficulty) {
        currentDifficulty = difficulty;
        wrongLetters = "";

        game = new Game(wordDatabase.getRandomWord(difficulty), stats);
        System.out.println("Rozpoczęto grę na poziomie: " + difficulty);

        messageArea.clear();
        hangmanDrawing.clear();
        replayButton.setVisible(false);
        updateGame();
        initialLayout.getChildren().clear();
        initialLayout.getChildren().addAll(new Label("Poziom trudności: " + difficulty), wordLabel, inputField,
                messageArea, hangmanDrawing);
    }

    private void updateGame() {
        wordLabel.setText(game.getGuessedWord());
        if (game.isComplete()) {
            messageArea.setText("Gratulacje! Odgadłeś słowo: " + game.getWord());
            hangmanDrawing.clear();
            showReplayButton();
        } else if (game.getAttempts() >= 10) {
            messageArea.setText("Przegrałeś! Słowo to: " + game.getWord());
            hangmanDrawing.clear();
            showReplayButton();
        }
    }

    private void showReplayButton() {
        replayButton.setVisible(true);
        initialLayout.getChildren().add(replayButton);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
