package com.kintai.Domain;

import com.kintai.Domain.DataString.BehindToDomainString;
import com.kintai.Domain.DataString.DomainString;

public class WorkInfo {
    private StartYMDHM startYMDHM;
    private EndYMDHM endYMDHM;

    public WorkInfo(DomainString domainString){
        this.startYMDHM = new StartYMDHMFactory().run(domainString.getStartString());
        this.endYMDHM = new EndYMDHMFactory().run(domainString.getEndString());
    }

    public StartYMDHM getStartYMDHM() {
        return startYMDHM;
    }

    public EndYMDHM getEndYMDHM() {
        return endYMDHM;
    }
}
