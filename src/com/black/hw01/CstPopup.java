package com.black.hw01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Popup;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Created by tblack on 8/31/16.
 */

class CstPopup extends Stage {


    CstPopup(String in){
        Label x = new Label(in);
        VBox y = new VBox();
        y.getChildren().add(x);
        this.setScene(new Scene(y, 200, 100));
        this.show();
    }
}