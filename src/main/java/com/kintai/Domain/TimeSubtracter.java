package com.kintai.Domain;

import com.kintai.Domain.HM.*;

import java.time.LocalTime;

public class TimeSubtracter {
    private final HM worktime;

    public TimeSubtracter(StartYMDHM startYMDHM, EndYMDHM endYMDHM){
        Long diff_hour = endYMDHM.untilHour(startYMDHM);
        Long diff_minute = endYMDHM.untilMinute(startYMDHM);
        String hour = Long.toString(diff_hour);
        String minute = Long.toString(diff_minute);
        worktime = new HM(LocalTime.of(Integer.parseInt(hour),Integer.parseInt(minute)));
    }

    public HM getHM(){
        return worktime;
    }

    public Hour getHour(){
        return worktime.getHour();
    }

    public Minute getMinute(){
        return worktime.getMinute();
    }
}
