package com.kintai.Domain.ManagedTime;

public class ManagedTime {
    private final ActualTime actualTime;
    private final OverTime overTime;

    public ManagedTime(ActualTime actualTime, OverTime overTime){
        this.actualTime = actualTime;
        this.overTime = overTime;
    }

    public ActualTime getActualTime() {
        return actualTime;
    }

    public OverTime getOverTime() {
        return overTime;
    }
}
