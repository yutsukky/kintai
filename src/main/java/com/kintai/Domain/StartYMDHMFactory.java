package com.kintai.Domain;

import com.kintai.Domain.DataString.YMDHMString;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.HMFactory;
import com.kintai.Domain.Ymd.*;

public class StartYMDHMFactory {
    private YMD ymd;
    private HM hm;

    public StartYMDHM run(YMDHMString ymdhmString){
        this.ymd = new YMDFactory().run(ymdhmString.getYmdString());
        this.hm = new HMFactory().run(ymdhmString.getHmString());
        new DelayChecker().check(hm.getLocalTime());
        return new StartYMDHM(ymd.getLocalDate(),hm.getLocalTime());
    }
}
