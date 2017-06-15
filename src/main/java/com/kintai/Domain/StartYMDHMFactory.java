package com.kintai.Domain;

import com.kintai.Domain.DataString.YMDHMString;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.HMFactory;
import com.kintai.Domain.Ymd.*;

public class StartYMDHMFactory {
    public StartYMDHM run(YMDHMString ymdhmString){
        YMD ymd = new YMDFactory().run(ymdhmString.getYmdString());
        new DateChecker().run(ymd.getLocalDate());
        HM hm = new HMFactory().run(ymdhmString.getHmString());
        new TimeChecker().check(hm.getLocalTime());
        return new StartYMDHM(ymd.atTime(hm.getLocalTime()));
    }
}
