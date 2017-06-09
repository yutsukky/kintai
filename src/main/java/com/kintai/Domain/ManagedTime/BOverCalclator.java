package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.Hour;
import com.kintai.Domain.HM.Minute;
import com.kintai.Domain.WorkInfo;

public class BOverCalclator {
    public OverTime calculate(WorkInfo workInfo){
        return new OverTime(new HM(new Hour(1),new Minute(1)));
    }
}
