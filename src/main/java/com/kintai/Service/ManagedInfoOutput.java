package com.kintai.Service;

import com.kintai.Domain.DataString.DomainStringList;
import com.kintai.Domain.ManagedTime.BManagedInfoList;
import com.kintai.Domain.ManagedTime.ManagedTimeList;
import com.kintai.Repository.TotalManagedTimeRepository;

public class ManagedInfoOutput {
    public void run(DomainStringList domainStringList, TotalManagedTimeRepository totalManagedTimeRepository){
        BManagedInfoList bManagedInfoList = domainStringList.toBManagedInfoList();
        ManagedTimeList managedTimeList = bManagedInfoList.toManagedTimeList();
        totalManagedTimeRepository.execute(managedTimeList.getTotalManageTime());
    }
}
