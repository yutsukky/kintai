package com.kintai.Domain.BreakTime;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;
import com.kintai.Domain.TimeCalculator;

public class BreakTime {
    private HM start;
    private HM end;

    public BreakTime(Integer startHour,Integer startMinute,Integer endHour,Integer endMinute){
        start = new HM(new Hour(startHour),new Minute(startMinute));
        end = new HM(new Hour(endHour),new Minute(endMinute));
    }

    public HM getStart(){
        return start;
    }

    public HM getEnd() {
        return end;
    }

    public Integer getStartTotal(){
        return start.getTotal();
    }

    public Integer getEndTotal(){
        return end.getTotal();
    }

    public HM getValue(){
        return new TimeCalculator(start,end).getHM();
    }

    public Integer getStartHourValue(){
        return start.getHourValue();
    }

    public Integer getStartMinuteValue(){
        return start.getMinuteValue();
    }

    public Integer getEndHourValue(){
        return end.getHourValue();
    }

    public Integer getEndMinuteValue(){
        return end.getMinuteValue();
    }
}
