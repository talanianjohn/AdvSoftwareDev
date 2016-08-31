package com.black.hw01;

/**
 * Created by Tanner on 8/30/2016.
 * Hw01
 * CS410 Advanced Software Dev
 * HANRAHAN
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HW01.fxml"));
        primaryStage.setTitle("HW01");
        primaryStage.setScene(new Scene(root, 560, 400));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}