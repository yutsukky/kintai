package com.kintai.Domain;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.HM.*;

public class CompareHM {
    public HM subtraction(HM start,HM end,HM worktime,BreakTime breaktime){
        if(end.getHourValue() > breaktime.getEndHourValue()){
            return new TimeCalculator(breaktime.getValue(),worktime).getHM();
        }
        if((end.getHourValue().equals(breaktime.getEndHourValue())) && (end.getMinuteValue() >= breaktime.getEndMinuteValue())){
            return new TimeCalculator(breaktime.getValue(),worktime).getHM();
        }
        if((end.getHourValue().equals(breaktime.getEndHourValue())) && (end.getMinuteValue() < breaktime.getEndMinuteValue())){
            return new TimeCalculator(breaktime.getValue(),worktime).getHM();
        }
        return worktime;
    }
}
