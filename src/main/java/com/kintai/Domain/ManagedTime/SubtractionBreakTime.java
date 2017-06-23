package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.EndYMDHM;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.MinusBreakTime;
import com.kintai.Domain.StartYMDHM;
import com.kintai.Domain.TimeSubtracter;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SubtractionBreakTime {
    public HM run(HM startHM, HM endHM){
        HM workTime = endHM.minus(startHM);
        BreakTime lunch = new BreakTime(new HM(LocalTime.of(12,0)),new HM(LocalTime.of(13,0)));
        BreakTime afterNoon = new BreakTime(new HM(LocalTime.of(18,0)),new HM(LocalTime.of(19,0)));
        BreakTime night = new BreakTime(new HM(LocalTime.of(21,0)),new HM(LocalTime.of(22,0)));
        workTime = new MinusBreakTime().subtraction(startHM,endHM,workTime,lunch);
        workTime = new MinusBreakTime().subtraction(startHM,endHM,workTime,afterNoon);
        return new MinusBreakTime().subtraction(startHM,endHM,workTime,night);
    }
}
