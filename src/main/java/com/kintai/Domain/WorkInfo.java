package com.kintai.Domain;

import com.kintai.Domain.DataString.DomainString;

public class WorkInfo {
    private final StartYMDHM startYMDHM;
    private final EndYMDHM endYMDHM;

    public WorkInfo(DomainString domainString){
        startYMDHM = new StartYMDHMFactory().run(domainString.getStartString());
        endYMDHM = new EndYMDHMFactory().run(domainString.getEndString(),startYMDHM);
    }

    public StartYMDHM getStartYMDHM() {
        return startYMDHM;
    }

    public EndYMDHM getEndYMDHM() {
        return endYMDHM;
    }
}
