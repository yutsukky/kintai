package com.kintai.Domain;

import com.kintai.Domain.HM.*;

public class WorkTimeCalculator {
    public HM calculate(StartYMDHM startYMDHM,EndYMDHM endYMDHM){
        HM startHM = startYMDHM.getHm();
        HM endHM = endYMDHM.getHm();
        Hour tmpHour = new DiffHour().calculate(startHM.getHour(),endHM.getHour());
        return new DiffHM().calculate(tmpHour,startHM.getMinute(),endHM.getMinute());
    }
}
