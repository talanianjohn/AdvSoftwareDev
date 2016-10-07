package com.black.exam.hw02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by tanner on 9/12/16.
 */
public class ServerQuery {

    ArrayList<String> urls = new ArrayList<>();

    public ServerQuery(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://tdbtech.co:3306/advsoftware","advsoft","advsoftware");
            Statement stmt= (Statement) con.createStatement();
            ResultSet rs= (ResultSet) stmt.executeQuery("select * from hw02");
            while(rs.next())
                urls.add(rs.getString(2));
                System.out.println(rs.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

    public ArrayList<String> getResults(){
        return urls;
    }
}

