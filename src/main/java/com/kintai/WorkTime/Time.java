package com.kintai.WorkTime;

public class Time {
    private Hour hour;
    private Minute minute;

    public Time(Hour hour,Minute minute){
        this.hour = hour;
        this.minute = minute;
    }

    public Integer getHourValue() {
        return hour.getHour();
    }

    public Integer getMinuteValue() {
        return minute.getMinute();
    }

    public Integer getTotal(){
        return getHourValue() * 100 + getMinuteValue();
    }
}
