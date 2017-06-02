package com.kintai.Ymd;

public class YMD {
    private YM ym;
    private Day day;

    public YMD(YM ym,Day day){
        this.ym = ym;
        this.day = day;
    }

    public YM getYm() {
        return ym;
    }

    public Day getDay() {
        return day;
    }

    public Integer getDayValue(){
        return day.getDay();
    }

    public Integer getMonthValue(){
        Month month = ym.getMonth();
        return month.getMonth();
    }

    public Integer getYearValue(){
        Year year = ym.getYear();
        return year.getYear();
    }
}
