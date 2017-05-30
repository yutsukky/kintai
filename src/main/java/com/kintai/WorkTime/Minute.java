package com.kintai.WorkTime;

public class Minute {
    private Integer minute;

    public Minute(Integer minute){
        if(minute < 0){
            throw new RuntimeException("分の入力値が不適切です．");
        }
        if(minute > 59){
            throw new RuntimeException("分の入力値が不適切です．");
        }
        this.minute = minute;
    }

    public Integer getMinute() {
        return minute;
    }
}
