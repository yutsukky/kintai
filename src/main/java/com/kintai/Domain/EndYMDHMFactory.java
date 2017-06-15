package com.kintai.Domain;

import com.kintai.Domain.DataString.YMDHMString;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.HMFactory;
import com.kintai.Domain.Ymd.YMD;
import com.kintai.Domain.Ymd.YMDFactory;

public class EndYMDHMFactory {
    private YMD ymd;
    private HM hm;

    public EndYMDHM run(YMDHMString ymdhmString){
        this.ymd = new YMDFactory().run(ymdhmString.getYmdString());
        this.hm = new HMFactory().run(ymdhmString.getHmString());
        return new EndYMDHM(ymd.getLocalDate(),hm.getLocalTime());
    }
}
