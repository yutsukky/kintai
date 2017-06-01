package com.kintai.Ymd;

import java.time.LocalDate;

public class YMD {
    private YM ym;
    private DayOfMonth day;

    public YMD(YM ym,DayOfMonth day){
        Integer OLD = 6;
        LocalDate today = LocalDate.now();
        LocalDate oldest = today.minusMonths(OLD);
        LocalDate value = LocalDate.of(ym.getYearValue(),ym.getMonthValue(),day.getValue());
        if(value.isAfter(today)){
            throw new RuntimeException("入力値が未来です．");
        }
        if(value.isBefore(oldest)){
            throw new RuntimeException(OLD + "ヶ月以上前の勤怠入力は無効です．");
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
