package com.kintai.Domain.ManagedTime;

import java.util.ArrayList;
import java.util.List;

public class ManagedTimeList {
    private final List<ManagedTime> managedTimeList;

    public ManagedTimeList(List<ManagedTime> managedTimeList){
        this.managedTimeList = managedTimeList;
    }

    private ActualTimeList toActualTimeList(){
        List<ActualTime> actualTimeList = new ArrayList<>();
        managedTimeList.forEach(v -> actualTimeList.add(v.getActualTime()));
        return new ActualTimeList(actualTimeList);
    }

    private OverTimeList toOverTimeList(){
        List<OverTime> overTimeList = new ArrayList<>();
        managedTimeList.forEach(v -> overTimeList.add(v.getOverTime()));
        return new OverTimeList(overTimeList);
    }

    public TotalManageTime getTotalManageTime(){
        return new TotalManageTime(toActualTimeList().getTotalTime(),toOverTimeList().getTotalTime());
    }

}
