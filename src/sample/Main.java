package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Aksel Jessen
 * @version 1.0.0 / 3.11.2020
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        primaryStage.setTitle("Umrechner");
        primaryStage.setScene(new Scene(root, 520, 120.0));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
