package com.kintai.Domain;

import com.kintai.Domain.HM.*;

public class DiffHour {
    public Hour calculate(Hour start,Hour end){
        Integer dayTohour = 24;
        if(start.getValue() > end.getValue()){
            return new Hour(dayTohour + end.getValue() - start.getValue());
        }
        return new Hour(end.getValue() - start.getValue());
    }
}
