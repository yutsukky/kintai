package com.kintai.Domain;

import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;

import java.time.LocalTime;

public class TimeChecker {
    public void check(LocalTime startTime){
        Integer HOUR_LIMIT = 9;
        Integer MINUTE_LIMIT = 0;
        LocalTime limitTime = LocalTime.of(HOUR_LIMIT,MINUTE_LIMIT);
        if(startTime.isAfter(limitTime)){
            throw new RuntimeException("遅刻は即クビです．");
        }
    }
}
