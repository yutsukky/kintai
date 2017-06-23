package com.kintai.Domain.BreakTime;

import com.kintai.Domain.HM.HM;

import java.time.LocalTime;

public class BreakTime {
    private final HM start;
    private final HM end;

    public BreakTime(HM start,HM end){
        this.start = start;
        this.end = end;
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
        LocalTime endLocalTime = end.getLocalTime();
        LocalTime startLocalTime = start.getLocalTime();
        LocalTime tmp1st = endLocalTime.minusMinutes(startLocalTime.getMinute());
        LocalTime tmp2nd = tmp1st.minusHours(startLocalTime.getHour());
        return new HM(tmp2nd);
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
