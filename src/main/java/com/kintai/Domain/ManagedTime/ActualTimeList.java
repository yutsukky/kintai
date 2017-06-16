package com.kintai.Domain.ManagedTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ActualTimeList {
    private List<ActualTime> actualTimeList = new ArrayList<>();
    private TotalTime totalTime = new TotalTime(0,0);

    public ActualTimeList(List<ActualTime> actualTimeList){
        this.actualTimeList = actualTimeList;
        calculateTotalTime();
    }

    private void calculateTotalTime(){
        actualTimeList.forEach(v -> totalTime = plusActualTime(v));
    }

    private TotalTime plusActualTime(ActualTime actualTime){
        LocalTime localTotalTime = LocalTime.of(0,totalTime.getMinute());
        LocalTime addedTime = localTotalTime.plusMinutes(actualTime.getMinuteValue());
        return new TotalTime(totalTime.getHour()+addedTime.getHour()+actualTime.getHourValue(),addedTime.getMinute());
    }

    public TotalTime getTotalTime(){
        return totalTime;
    }
}
