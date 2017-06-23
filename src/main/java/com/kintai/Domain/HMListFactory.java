package com.kintai.Domain;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.HM.*;

import java.util.ArrayList;
import java.util.List;

public class HMListFactory {
    public List<HM> run(HM start,HM end,BreakTime breaktime){
        List<HM> HmList = new ArrayList();
        HmList.add(0,start);
        HmList.add(1,end);
        HmList.add(2,breaktime.getStart());
        HmList.add(3,breaktime.getEnd());
        return HmList;
    }
}
