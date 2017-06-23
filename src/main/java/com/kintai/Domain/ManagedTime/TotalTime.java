package com.kintai.Domain.ManagedTime;

public class TotalTime {
    private final Integer hour;
    private final Integer minute;

    public TotalTime(Integer hour, Integer minute){
        this.hour = hour;
        this.minute = minute;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getMinute() {
        return minute;
    }
}
