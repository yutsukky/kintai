package com.kintai.Domain;

import com.kintai.Domain.DataString.YMDHMString;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.HMFactory;
import com.kintai.Domain.Ymd.YMD;
import com.kintai.Domain.Ymd.YMDFactory;

public class ManagedStartYMDHMFactory {
    public StartYMDHM run(YMDHMString ymdhmString){
        YMD ymd = new YMDFactory().run(ymdhmString.getYmdString());
        HM hm = new HMFactory().run(ymdhmString.getHmString());
        return new StartYMDHM(ymd.atTime(hm.getLocalTime()));
    }
}
