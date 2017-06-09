package com.kintai.Domain.HM;

public class HM {
    private Hour hour;
    private Minute minute;

    public HM(Hour hour,Minute minute){
        this.hour = hour;
        this.minute = minute;
    }

    public Hour getHour(){ return hour; }

    public Minute getMinute(){ return minute; }

    public Integer getHourValue() {
        return hour.getValue();
    }

    public Integer getMinuteValue() {
        return minute.getValue();
    }

    public Integer getTotal(){
        return getHourValue() * 100 + getMinuteValue();
    }
}
