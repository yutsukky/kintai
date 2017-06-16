package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.DataString.DomainStringList;

import java.util.ArrayList;
import java.util.List;

public class BManagedInfoList {
    private List<BManagedInfo> bManagedInfoList = new ArrayList<>();

    public BManagedInfoList(List<BManagedInfo> bManagedInfoList){
        this.bManagedInfoList = bManagedInfoList;
    }

    public List<BManagedInfo> getBManagedInfoList() {
        return bManagedInfoList;
    }

    public ManagedTimeList toManagedTimeList(){
        List<ManagedTime> managedTimeList = new ArrayList<>();
        bManagedInfoList.forEach(v -> managedTimeList.add(v.getManagedTime()));
        return new ManagedTimeList(managedTimeList);
    }
}
