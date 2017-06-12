package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.CompareHM;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.TimeCalculator;

public class SubtractionBreakTime {
    public HM run(HM startHm,HM endHm){
        HM result = new TimeCalculator(startHm,endHm).getHM();
        result = new CompareHM().subtraction(startHm,endHm,result,new BreakTime());
        return result;
    }
}
