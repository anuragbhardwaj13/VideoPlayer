package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        load sample.fxml
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Anurag_VP");
        primaryStage.setScene(new Scene(root, 800, 650));
        primaryStage.show();
//        Scene scene = new Scene(root, 1280, 760, Color.BLACK);
//        primaryStage.setScene(scene);
//        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
