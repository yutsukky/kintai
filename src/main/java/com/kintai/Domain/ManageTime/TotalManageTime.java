package com.kintai.Domain.ManageTime;

public class TotalManageTime {
    private Integer actual;
    private Integer over;

    public TotalManageTime(Integer actual,Integer over){
        this.actual = actual;
        this.over = over;
    }

    public Integer getActual() {
        return actual;
    }

    public Integer getOver() {
        return over;
    }
}
