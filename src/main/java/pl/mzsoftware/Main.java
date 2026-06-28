package pl.mzsoftware;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(8);
        root.setPadding(new Insets(20));

        root.getChildren().add(new Label("Hello and welcome!"));
        for (int i = 1; i <= 5; i++) {
            root.getChildren().add(new Label("i = " + i));
        }

        stage.setTitle("Kroye");
        stage.setScene(new Scene(root, 300, 220));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
