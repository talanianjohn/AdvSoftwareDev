package com.black.hw01;


/**
 * Created by tblack on 8/31/16.
 */
public class SchedEntry{
    String Day;
    String Title;
    String Detail;

    public SchedEntry(String day, String title) {
        Day = day;
        Title = title;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    @Override
    public String toString() {
        return "SchedEntry{" +
                "Day='" + Day + '\'' +
                ", Title='" + Title + '\'' +
                '}';
    }
}
