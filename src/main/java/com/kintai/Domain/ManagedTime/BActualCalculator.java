package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.EndYMDHM;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;
import com.kintai.Domain.StartYMDHM;
import com.kintai.Domain.WorkInfo;

public class BActualCalculator {
    public ActualTime calculate(StartYMDHM startYMDHM, EndYMDHM endYMDHM){
        return new ActualTime(new SubtractionBreakTime().run(startYMDHM.getHm(),endYMDHM.getHm()));
    }
}
