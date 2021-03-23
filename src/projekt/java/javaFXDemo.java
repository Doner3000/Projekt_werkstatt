package projekt.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class javaFXDemo extends Application {

    @Override
    public void start(Stage primaryStage){
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxtest/test.fxml"));

        primaryStage.setTitle("FX Demo App");

        Scene scene = new Scene(rootPane, 100, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
