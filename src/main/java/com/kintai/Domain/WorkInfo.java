package com.kintai.Domain;

import com.kintai.Domain.DataString.BehindToDomain;

public class WorkInfo {
    private StartYMDHM startYMDHM;
    private EndYMDHM endYMDHM;

    public WorkInfo(BehindToDomain behindToDomain){
        this.startYMDHM = new StartYMDHM(behindToDomain);
        this.endYMDHM = new EndYMDHM(behindToDomain);
    }

    public StartYMDHM getStartYMDHM() {
        return startYMDHM;
    }

    public EndYMDHM getEndYMDHM() {
        return endYMDHM;
    }
}
