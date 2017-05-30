package com.kintai.Ymd;

public class Day {
    private Integer day;

    public Day(Integer day){
        if(day > 31){
            throw new RuntimeException("日付の入力値が不適切です．");
        }
        if(day < 1){
            throw new RuntimeException("日付の入力値が不適切です．");
        }
        this.day = day;
    }

    public Integer getDay() {
        return day;
    }
}
