package com.kintai.Ymd;

public class Month {
    private Integer month;

    public Month(Integer month){
        if(month > 12){
            throw new RuntimeException("月の入力値が不適切です．");
        }
        if(month < 1){
            throw new RuntimeException("月の入力値が不適切です．");
        }
        this.month = month;
    }

    public Integer getMonth() {
        return month;
    }
}
