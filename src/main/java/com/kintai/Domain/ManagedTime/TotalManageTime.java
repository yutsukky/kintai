package com.kintai.Domain.ManagedTime;

public class TotalManageTime {
    private TotalTime actual;
    private TotalTime over;

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
