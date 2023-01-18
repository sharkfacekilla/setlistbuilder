import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Setlist Builder");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label setlistLengthLabel = new Label("Setlist Length:");
        grid.add(setlistLengthLabel, 0, 0);

        TextField setlistLengthField = new TextField();
        grid.add(setlistLengthField, 1, 0);

        Button createSetlistButton = new Button("Create Setlist");
        grid.add(createSetlistButton, 1, 2);
        createSetlistButton.setOnAction(e -> {
            int setlistLength = Integer.parseInt(setlistLengthField.getText());
            // create setlist with the given length
            // ...
        });

        Scene scene = new Scene(grid, 1000, 500);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
