package com.black.hw02;

/**
 * Created by Tanner on 8/30/2016.
 * Hw01
 * CS410 Advanced Software Dev
 * HANRAHAN
 */

import com.black.hw01.CstPopup;
import com.black.hw01.SchedEntry;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * Created by Tanner on 8/30/2016.
 */
public class Controller implements Initializable {

    Image duck = new Image("https://upload.wikimedia.org/wikipedia/commons/5/51/Mandarin.duck.arp.jpg");
    Image duck2 = new Image("https://upload.wikimedia.org/wikipedia/commons/2/24/Male_mallard_duck_2.jpg");

    @FXML
    TextArea ta;
    @FXML
    ImageView img;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    img.setImage(duck);
    img.setFitWidth(477.0);
    img.setFitHeight(340.0);

    }


}
