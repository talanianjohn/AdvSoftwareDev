/**
 * Created by Tanner on 8/30/2016.
 * Hw01
 * CS410 Advanced Software Dev
 * HANRAHAN
 */

package com.black.hw01;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;


public class CustomPanel {
    /*
    * Custom JavaFX panel creates a HashMap and associates details to it, that are later called by a ID connected to an action listener.
    *
    * */

    HashMap<String,String> details = new HashMap<>();

    public CustomPanel() {

        JFrame frame = new JFrame ("Display File");
        frame.setPreferredSize(new Dimension(500,265));
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        JEditorPane ta = new JEditorPane ("text/html", "");
        JTable jtab =  new JTable(loadSchedule(), loadColumns()){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //Header info is added to the header text field.
        final String info="Tanner Black\n<br>" +
                "CS410 Advanced Software Dev\n<br>" +
                "Hanrahan\n<br>" +
                "\n<br>" +
                "\n<br>" +
                "<b>CLICK AN ITEM ON THE SCHEDULE FOR DETAIL</b>"; // Header String
        LoadHashMap();
        ta.setText (info);

        panel1.add(ta,BorderLayout.PAGE_START);
        Listen(jtab);
        panel1.add(new JScrollPane(jtab),BorderLayout.PAGE_END);
        frame.getContentPane().add (panel1);
        frame.pack();
        frame.setVisible(true);

    }
    public Object[][] loadSchedule(){ //Load data for table
        Object[][] data = {
                {"Work", "Work", "Work", "Work", "Work"},
                {"CS-410", "CS-420", "CS-410", "CS-420", " "},
                {"CS-395", "IHFR-101", "CS-395", "IHFR-100", " "},
                {" ", " ", "MGT-101", " ", " "}
        };
        return data;

    }
    public String[] loadColumns(){  //Load column names of table
        String[] columnNames =
                {"Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday"
        };
        return columnNames;

    }


    /*
    This Method Listens to the the actions of each table row and column, it allows you to determine which is selected and then find the value from that using the data array
    Once the name is found then the hashmap is checked for the key to call the description
     */
    public void Listen(JTable jt)
    {
        jt.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jt.rowAtPoint(evt.getPoint());
                int col = jt.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
                    System.out.println(loadSchedule()[row][col]);
                    OpenDetail((String) loadSchedule()[row][col]);  //Loads the detail
                }
            }
        });
    }

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

    public void OpenDetail(String det) // Open Details of a class
    {
        JOptionPane.showMessageDialog(new JFrame(),
                details.get(det));
    }



}
