package com.kintai.Domain;

import com.kintai.Domain.DataString.BehindToDomain;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.HMFactory;
import com.kintai.Domain.Ymd.YMD;
import com.kintai.Domain.Ymd.YMDTransform;

public class EndYMDHM {
    private YMD ymd;
    private HM hm;

    public EndYMDHM(BehindToDomain behindToDomain){
        ymd = new YMDTransform().run(behindToDomain.getYmdString());
        hm = new HMFactory().run(behindToDomain.getEndString());
    }

    public YMD getYmd() {
        return ymd;
    }

    public HM getHm(){
        return hm;
    }
}
