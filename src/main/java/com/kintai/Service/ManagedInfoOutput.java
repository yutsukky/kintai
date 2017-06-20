package com.kintai.Service;

import com.kintai.Domain.DataString.DomainStringList;
import com.kintai.Domain.ManagedTime.BManagedInfoList;
import com.kintai.Domain.ManagedTime.ManagedTimeList;
import com.kintai.Repository.TotalManagedTimeRepository;

public class ManagedInfoOutput {
    private final TotalManagedTimeRepository totalManagedTimeRepository;

    public ManagedInfoOutput(TotalManagedTimeRepository totalManagedTimeRepository){
        this.totalManagedTimeRepository = totalManagedTimeRepository;
    }

    public void run(DomainStringList domainStringList){
        BManagedInfoList bManagedInfoList = domainStringList.toBManagedInfoList();
        ManagedTimeList managedTimeList = bManagedInfoList.toManagedTimeList();
        totalManagedTimeRepository.execute(managedTimeList.getTotalManageTime());
    }
}
