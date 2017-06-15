package com.kintai.Domain.Ymd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class YMD {

    private LocalDate localDate;

    public YMD(LocalDate localDate){
        this.localDate = localDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public LocalDateTime atTime(LocalTime localTime){
        return localDate.atTime(localTime);
    }

    public String getYMDString(){
        return String.format("%04d%02d%02d",getYearValue(),getMonthValue(),getDayValue());
    }

    public Integer getDayValue(){
        return localDate.getDayOfMonth();
    }

    public Integer getMonthValue(){
        return localDate.getMonthValue();
    }

    public Integer getYearValue(){
        return localDate.getYear();
    }


}
