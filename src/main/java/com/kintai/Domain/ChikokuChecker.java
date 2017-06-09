package com.kintai.Domain;

import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;

public class ChikokuChecker {
    public void check(Hour hour, Minute minute){
        Integer HOUR_LIMIT = 9;
        if(hour.getValue() > HOUR_LIMIT){
            throw new RuntimeException("遅刻は即クビです．");
        }
        Integer MINUTE_LIMIT = 0;
        if(hour.getValue().equals(HOUR_LIMIT) && (minute.getValue() > MINUTE_LIMIT)){
            throw new RuntimeException("遅刻は即クビです．");
        }
    }
}
