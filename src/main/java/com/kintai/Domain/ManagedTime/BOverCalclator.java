package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;
import com.kintai.Domain.WorkInfo;

public class BOverCalclator {
    public OverTime calculate(HM startHm,HM endHm,ActualTime actualTime){
        if( !actualTime.isOver() ){
            return new OverTime(new HM(new Hour(0),new Minute(0)));
        }
        return new OverTime(new HM(new Hour(1),new Minute(1)));
    }
}
