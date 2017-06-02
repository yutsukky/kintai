package com.kintai.Ymd;

public class YM {
    private Year year;
    private Month month;

    public YM(Year year,Month month){
        this.year = year;
        this.month = month;
    }

    public Year getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }
}
