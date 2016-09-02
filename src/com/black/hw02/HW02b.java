package com.black.hw02;

import com.black.hw01.CstPopup;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by tblack on 9/1/16.
 */
public class HW02b extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HW02.fxml"));
        primaryStage.setTitle("HW02 -- TBlack");
        primaryStage.setScene(new Scene(root, 560, 400));
        primaryStage.show();
        //new CstPopup("hello");


    }
    public static void main(String[] args) {
        launch(args);


    }
}
