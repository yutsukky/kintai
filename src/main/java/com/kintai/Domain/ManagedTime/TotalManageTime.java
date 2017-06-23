package com.kintai.Domain.ManagedTime;

public class TotalManageTime {
    private final TotalTime actual;
    private final TotalTime over;

    public TotalManageTime(TotalTime actual, TotalTime over){
        this.actual = actual;
        this.over = over;
    }

    public TotalTime getActual() {
        return actual;
    }

    public TotalTime getOver() {
        return over;
    }
}
