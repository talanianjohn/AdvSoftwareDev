package com.black.hw01;

/**
 * Created by Tanner on 8/30/2016.
 * Hw01
 * CS410 Advanced Software Dev
 * HANRAHAN
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Tanner on 8/30/2016.
 */
public class Controller implements Initializable {
    @FXML
    private TextArea ta;
    @FXML
    private TableColumn DayOfWeek ;
    @FXML
    private TableColumn EvntOnDay;

    @FXML
    private TableView<SchedEntry> tbl;


    final ObservableList<SchedEntry> data = FXCollections.observableArrayList(
            new SchedEntry("Monday - Friday","Work"),
            new SchedEntry("Monday and Wednesday","CS-410"),
            new SchedEntry("Monday and Wednesday","CS-395"),
            new SchedEntry("Tuesday and Thursday","CS-420"),
            new SchedEntry("Tuesday and Thursday","IHFR-101"),
            new SchedEntry("Wednesday","MGT-101")
    );



    public void LoadHeader(){
        final String info="Tanner Black\n" +
                "CS410 Advanced Software Dev\n" +
                "Hanrahan"; // Header String

        ta.setText(info);

        DayOfWeek.setCellValueFactory(
                new PropertyValueFactory<SchedEntry,String>("Day")
        );
        EvntOnDay.setCellValueFactory(
                new PropertyValueFactory<SchedEntry,String>("Title")
        );

        tbl.setItems(data);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LoadHeader();
    }
}
