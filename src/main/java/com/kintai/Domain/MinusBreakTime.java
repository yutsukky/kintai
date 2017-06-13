package com.kintai.Domain;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.HM.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinusBreakTime {
    public HM subtraction(HM start,HM end,HM worktime,BreakTime breaktime){
        if( (start.getTotal() < breaktime.getStartTotal()) && (end.getTotal() < breaktime.getStartTotal())){
            return worktime;
        }
        if( (start.getTotal() > breaktime.getEndTotal()) && (end.getTotal() > breaktime.getEndTotal())){
            return worktime;
        }
        List<HM> HmList = new HMListFactory().run(start,end,breaktime);
        HmList = HmList.stream().sorted(Comparator.comparing(HM::getTotal)).collect(Collectors.toList());
        HM diff = new TimeCalculator(HmList.get(1),HmList.get(2)).getHM();
        return new TimeCalculator(diff,worktime).getHM();
    }
}
