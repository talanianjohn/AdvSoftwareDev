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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.HashMap;
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

    private HashMap<String,String> details= new HashMap<>();

    public void LoadHashMap(){ // Load the hashmap with data, seperated for future use with Databases

        details.put("CS-410","Advanced Software Development\n" +
                "Professor Hanrahan\n" +
                "12:00 PM - 1:45 PM");
        details.put("CS-420","E-Commerce\n" +
                "Professor Black\n" +
                "4:00 PM - 5:45 PM");
        details.put("CS-395","Mobile App Development\n" +
                "Professor Onyon\n" +
                "4:00 PM - 5:45 PM");
        details.put("IHFR-101","Elementary French\n" +
                "Professor Durnford\n" +
                "6:00 PM - 7:45 PM");
        details.put("MGT-101","Intro to Management\n" +
                "Professor Simoneau\n" +
                "6:00 PM - 7:45 PM");
        details.put("Work","Bradford Networks\n" +
                "7:00 AM - 3:00 PM");


    }


    // FIll table with entries
    final ObservableList<SchedEntry> data = FXCollections.observableArrayList(
            new SchedEntry("Monday - Friday","Work"),
            new SchedEntry("Monday and Wednesday","CS-410"),
            new SchedEntry("Monday and Wednesday","CS-395"),
            new SchedEntry("Tuesday and Thursday","CS-420"),
            new SchedEntry("Tuesday and Thursday","IHFR-101"),
            new SchedEntry("Wednesday","MGT-101")
    );


// Load header field
    public void LoadHeader(){
        LoadHashMap();
        final String info="Tanner Black\n" +
                "CS410 Advanced Software Dev\n" +
                "Hanrahan\n"+
                "**Double Click Row for Details**"; // Header String

        ta.setText(info);
        tbl.setRowFactory( tv -> {
            TableRow<SchedEntry> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (! row.isEmpty()) ) {
                    SchedEntry rowData = row.getItem();
                    new CstPopup(details.get(rowData.getTitle()));
                }
            });
            return row ;
        });

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
