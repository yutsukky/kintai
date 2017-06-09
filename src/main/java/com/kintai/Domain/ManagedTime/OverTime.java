package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.WorkTime.Time;

public class OverTime {
    private Time time;

    public OverTime(Time time){
        this.time = time;
    }

    public Time getTime() {
        return time;
    }
}
