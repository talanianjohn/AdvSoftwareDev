package com.black.hw01;

/**
 * Created by Tanner on 8/30/2016.
 * Hw01
 * CS410 Advanced Software Dev
 * HANRAHAN
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import javafx.scene.control.TableColumn;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Tanner on 8/30/2016.
 */
public class Controller implements Initializable {

    Object[][] data = {
            {"Work", "Work", "Work", "Work", "Work"},
            {"CS-410", "CS-420", "CS-410", "CS-420", " "},
            {"CS-395", "IHFR-101", "CS-395", "IHFR-100", " "},
            {" ", " ", "MGT-101", " ", " "}
    };


    @FXML
    private TextArea ta;
    @FXML
    private TableColumn Monday;
    @FXML
    private TableColumn Tuesday;
    @FXML
    private TableColumn Wednesday;
    @FXML
    private TableColumn Thursday;
    @FXML
    private TableColumn Friday;
    @FXML
    private TableView<Object[][]> tbl;
    



    public void LoadHeader(){
        final String info="Tanner Black\n" +
                "CS410 Advanced Software Dev\n" +
                "Hanrahan"; // Header String

        ta.setText(info);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LoadHeader();
    }
}
