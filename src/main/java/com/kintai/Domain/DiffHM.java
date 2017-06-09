package com.kintai.Domain;

import com.kintai.Domain.HM.*;

public class DiffHM {
    public HM calculate(Hour hour,Minute start,Minute end){
        Integer hourTominute = 60;
        Minute minute;
        if(start.getValue() > end.getValue()){
             minute = new Minute(hourTominute + end.getValue() - start.getValue());
             return new HM(new Hour(hour.getValue()-1),minute);
        }
        minute = new Minute(end.getValue() - start.getValue());
        return new HM(hour,minute);
    }
}
