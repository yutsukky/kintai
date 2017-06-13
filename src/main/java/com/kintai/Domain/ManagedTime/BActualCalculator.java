package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;
import com.kintai.Domain.WorkInfo;

public class BActualCalculator {
    public ActualTime calculate(HM startHm,HM endHm){
        Integer A_DAY_HOUR = 24;
        HM limitedEndHm = endHm;
        if(endHm.getHourValue() >= A_DAY_HOUR){
            limitedEndHm = new HM(new Hour(A_DAY_HOUR),new Minute(0));
        }
        return new ActualTime(new SubtractionBreakTime().run(startHm,limitedEndHm));
    }
}
