package com.black.hw01;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 *  Created by tblack on 8/31/16.
 *
 * Custom Popup for FX related Projects
 *
 */



public class CstPopup extends Stage {
    //Constructor creates a label and puts it in VBox, scene is set and
    public CstPopup(String in){
        Label x = new Label(in);
        VBox y = new VBox();
        y.getChildren().add(x);
        this.setScene(new Scene(y, 200, 100));
        this.show();
    }
}