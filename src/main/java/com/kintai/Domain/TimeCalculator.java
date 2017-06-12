package com.kintai.Domain;

import com.kintai.Domain.HM.*;

public class TimeCalculator {
    private HM worktime;

    public TimeCalculator(HM startHm, HM endHm){
        Hour tmpHour = new DiffHour().calculate(startHm.getHour(),endHm.getHour());
        worktime = new DiffHM().calculate(tmpHour,startHm.getMinute(),endHm.getMinute());
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
