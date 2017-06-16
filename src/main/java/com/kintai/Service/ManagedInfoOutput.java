package com.kintai.Service;

import com.kintai.Domain.DataString.DomainStringList;
import com.kintai.Domain.ManagedTime.BManagedInfoList;
import com.kintai.Domain.ManagedTime.ManagedTimeList;

public class ManagedInfoOutput {
    public void run(DomainStringList domainStringList){
        BManagedInfoList bManagedInfoList = domainStringList.toBManagedInfoList();
        ManagedTimeList managedTimeList = bManagedInfoList.toManagedTimeList();
    }
}
