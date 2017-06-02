package com.kintai.WorkTime;

public class Hour {
    private Integer hour;

    public Hour(Integer hour){
        if(hour < 0){
            throw new RuntimeException("時間の入力値が不適切です．");
        }
        if(hour > 23){
            throw new RuntimeException("時間の入力値が不適切です．");
        }
        this.hour = hour;
    }

    public Integer getHour() {
        return hour;
    }
}
