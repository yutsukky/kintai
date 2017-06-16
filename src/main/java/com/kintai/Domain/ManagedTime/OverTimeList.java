package com.kintai.Domain.ManagedTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class OverTimeList {
    private List<OverTime> overTimeList = new ArrayList<>();
    private TotalTime totalTime = new TotalTime(0,0);

    public OverTimeList(List<OverTime> overTimeList){
        this.overTimeList = overTimeList;
        calculateTotalTime();
    }

    private void calculateTotalTime(){
        overTimeList.forEach(v -> totalTime = plusOverTime(v));
    }

    private TotalTime plusOverTime(OverTime overTime){
        LocalTime localTotalTime = LocalTime.of(0,totalTime.getMinute());
        LocalTime addedTime = localTotalTime.plusMinutes(overTime.getMinuteValue());
        return new TotalTime(totalTime.getHour()+addedTime.getHour()+overTime.getHourValue(),addedTime.getMinute());
    }

    public TotalTime getTotalTime(){
        return totalTime;
    }
}
