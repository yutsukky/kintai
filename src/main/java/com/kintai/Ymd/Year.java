package com.kintai.Ymd;

public class Year {
    private Integer year;

    public Year(Integer year){
        if(year < 2017){
            throw new RuntimeException("西暦の入力値が過去です．");
        }
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }
}
