package com.kintai.Domain.Ymd;

import java.time.LocalDate;

public class YMDForTotal {
    private YM ym;
    private DayOfMonth day;

    public YMDForTotal(YM ym, DayOfMonth day){
        LocalDate today = LocalDate.now();
        LocalDate value = LocalDate.of(ym.getYearValue(),ym.getMonthValue(),day.getValue());
        if(value.isAfter(today)){
            throw new RuntimeException("入力値が未来です．");
        }
        this.ym = ym;
        this.day = day;
    }

    public YM getYm() {
        return ym;
    }

    public DayOfMonth getDay() {
        return day;
    }

    public Integer getDayValue(){
        return day.getValue();
    }

    public Integer getMonthValue(){
        Month month = ym.getMonth();
        return month.getValue();
    }

    public Integer getYearValue(){
        Year year = ym.getYear();
        return year.getValue();
    }
}
