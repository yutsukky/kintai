package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.HM;
import java.time.LocalTime;

public class BOverCalclator {
    public OverTime calculate(ActualTime actualTime){
        Integer DEFAULT_WORK_TIME = 8;
        if( !actualTime.isOver() ){
            return new OverTime(new HM(LocalTime.of(0,0)));
        }
        HM overTime = actualTime.getHm();
        return new OverTime(overTime.minus(new HM(LocalTime.of(DEFAULT_WORK_TIME,0))));
    }
}
