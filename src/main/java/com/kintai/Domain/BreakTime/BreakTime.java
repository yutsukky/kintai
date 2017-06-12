package com.kintai.Domain.BreakTime;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;
import com.kintai.Domain.TimeCalculator;

public class BreakTime {
    private HM start;
    private HM end;

    public BreakTime(){
        start = new HM(new Hour(12),new Minute(0));
        end = new HM(new Hour(13),new Minute(0));
    }

    public HM getEnd() {
        return end;
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
