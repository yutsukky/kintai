package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.MinusBreakTime;
import com.kintai.Domain.TimeCalculator;

public class SubtractionBreakTime {
    public HM run(HM startHm,HM endHm){
        HM result = new TimeCalculator(startHm,endHm).getHM();
        result = new MinusBreakTime().subtraction(startHm,endHm,result,new BreakTime(12,0,13,0));
        result = new MinusBreakTime().subtraction(startHm,endHm,result,new BreakTime(18,0,19,0));
        result = new MinusBreakTime().subtraction(startHm,endHm,result,new BreakTime(21,0,22,0));

        return result;
    }
}
