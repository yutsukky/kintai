package com.kintai.Domain;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.HM.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinusBreakTime {
    public HM subtraction(HM startHM,HM endHM,HM workTime,BreakTime breakTime){
        if( (startHM.getTotal() < breakTime.getStartTotal()) && (endHM.getTotal() < breakTime.getStartTotal())){
            return workTime;
        }
        if( (startHM.getTotal() > breakTime.getEndTotal()) && (endHM.getTotal() > breakTime.getEndTotal())){
            return workTime;
        }
        List<HM> HmList = new HMListFactory().run(startHM,endHM,breakTime);
        HmList = HmList.stream().sorted(Comparator.comparing(HM::getTotal)).collect(Collectors.toList());
        HM Larger = HmList.get(2);
        return workTime.minus(Larger.minus(HmList.get(1)));
    }
}
