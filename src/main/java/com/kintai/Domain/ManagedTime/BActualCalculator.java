package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;
import com.kintai.Domain.WorkInfo;

public class BActualCalculator {
    public ActualTime calculate(WorkInfo workInfo){
        return new ActualTime(new HM(new Hour(1),new Minute(1)));
    }
}
