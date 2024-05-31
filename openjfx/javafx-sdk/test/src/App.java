import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hangman Game");

        // Tworzenie etykiet i przycisków
        Label wordLabel = new Label("Hasło:");
        TextField wordField = new TextField();
        Button guessButton = new Button("Zgadnij");
        Label levelLabel = new Label("Poziom trudności:");
        Button easyButton = new Button("Łatwy");
        Button mediumButton = new Button("Średni");
        Button hardButton = new Button("Trudny");
        Button statsButton = new Button("Statystyki");

        // Utworzenie siatki i ustawienie odstępów
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Dodanie elementów do siatki
        GridPane.setConstraints(wordLabel, 0, 0);
        GridPane.setConstraints(wordField, 1, 0);
        GridPane.setConstraints(guessButton, 2, 0);
        GridPane.setConstraints(levelLabel, 0, 1);
        GridPane.setConstraints(easyButton, 1, 1);
        GridPane.setConstraints(mediumButton, 2, 1);
        GridPane.setConstraints(hardButton, 3, 1);
        GridPane.setConstraints(statsButton, 0, 2);

        grid.getChildren().addAll(wordLabel, wordField, guessButton, levelLabel, easyButton, mediumButton, hardButton,
                statsButton);

        // Obsługa zdarzenia kliknięcia przycisku "Zgadnij"
        guessButton.setOnAction(e -> {
            // Dodaj logikę sprawdzania zgadywanej litery
        });

        // Obsługa zdarzenia kliknięcia przycisków poziomu trudności
        easyButton.setOnAction(e -> {
            // Dodaj logikę wyboru łatwego poziomu trudności
        });
        mediumButton.setOnAction(e -> {
            // Dodaj logikę wyboru średniego poziomu trudności
        });
        hardButton.setOnAction(e -> {
            // Dodaj logikę wyboru trudnego poziomu trudności
        });

        // Obsługa zdarzenia kliknięcia przycisku "Statystyki"
        statsButton.setOnAction(e -> {
            // Dodaj logikę wyświetlania statystyk
        });

        // Utwórz scenę i ustaw ją w głównym oknie
        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);

        // Wyświetl główne okno
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
