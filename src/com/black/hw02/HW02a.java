package com.black.hw02;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by tblack on 9/1/16.
 */
public class HW02a {



    public static void main(String[] args) throws IOException {

        ArrayList<String> urls = new ServerQuery().getResults();


        if(urls.size()>0)
        new GUI(urls.get(0),"Tanner Black\n" +
                "Advanced Software Dev\n" +
                "CS395 Hanrahan");


    }
}
