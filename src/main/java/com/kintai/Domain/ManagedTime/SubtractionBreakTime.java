package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.EndYMDHM;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.MinusBreakTime;
import com.kintai.Domain.StartYMDHM;
import com.kintai.Domain.TimeSubtracter;

import java.util.ArrayList;
import java.util.List;

public class SubtractionBreakTime {
    public HM run(HM startHM, HM endHM){
        HM workTime = endHM.minus(startHM);
        workTime = new MinusBreakTime().subtraction(startHM,endHM,workTime,new BreakTime(12,0,13,0));
        workTime = new MinusBreakTime().subtraction(startHM,endHM,workTime,new BreakTime(18,0,19,0));
        return new MinusBreakTime().subtraction(startHM,endHM,workTime,new BreakTime(21,0,22,0));
    }
}
