package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;
import com.kintai.Domain.TimeCalculator;
import com.kintai.Domain.WorkInfo;

public class BOverCalclator {
    public OverTime calculate(ActualTime actualTime){
        Integer DEFAULT_WORK_TIME = 8;
        if( !actualTime.isOver() ){
            return new OverTime(new HM(new Hour(0),new Minute(0)));
        }
        HM overTime = new HM(new Hour(actualTime.getHourValue() - DEFAULT_WORK_TIME),new Minute(actualTime.getMinuteValue()));
        return new OverTime(overTime);
    }
}
