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

    public Integer getYearValue(){
        return year.getValue();
    }

    public Month getMonth() {
        return month;
    }

    public Integer getMonthValue(){
        return month.getValue();
    }
}
