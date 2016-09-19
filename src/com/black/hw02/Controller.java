package com.black.hw02;

/**
 * Created by Tanner on 8/30/2016.
 * Hw01
 * CS410 Advanced Software Dev
 * HANRAHAN
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Tanner on 8/30/2016.
 */
public class Controller implements Initializable {

    Image duck = new Image(new ServerQuery().getResults().get(0));

    @FXML
    TextArea ta;
    @FXML
    ImageView img;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ta.setText("Tanner Black\n" +
                "Advanced Software Dev\n" +
                "CS395 Hanrahan");
    img.setImage(duck);
    img.setFitWidth(477.0);
    img.setFitHeight(340.0);

    }


}
