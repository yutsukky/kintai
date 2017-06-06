package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.WorkTime.Time;

public class ActualTime {
    private Time time;

    public ActualTime(Time time){
        this.time = time;
    }

    public Time getTime() {
        return time;
    }
}
