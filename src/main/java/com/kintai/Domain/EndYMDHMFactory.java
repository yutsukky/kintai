package com.kintai.Domain;

import com.kintai.Domain.DataString.YMDHMString;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.HMFactory;
import com.kintai.Domain.Ymd.YMD;
import com.kintai.Domain.Ymd.YMDFactory;

public class EndYMDHMFactory {
    public EndYMDHM run(YMDHMString ymdhmString,StartYMDHM startYMDHM) {
        YMD ymd = new YMDFactory().run(ymdhmString.getYmdString());
        HM hm = new HMFactory().run(ymdhmString.getHmString());
        EndYMDHM endYMDHM = new EndYMDHM(ymd.atTime(hm.getLocalTime()));
        if(endYMDHM.isBefore(startYMDHM)){
            return endYMDHM.plusADay();
        }
        return endYMDHM;
    }
}
