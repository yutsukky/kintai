package com.kintai.Domain.DataString;

import com.kintai.Domain.ManagedTime.BManagedInfo;
import com.kintai.Domain.ManagedTime.BManagedInfoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DomainStringList {
    private List<DomainString> domainStringList = new ArrayList<>();

    public DomainStringList(HashMap<String, String[]> rawHash){
        rawHash.forEach((key,value) -> {
                DomainString domainString = new DomainString(key,value);
                domainStringList.add(domainString);
            }
        );
    }

    public List<DomainString> getDomainStringList(){
        return domainStringList;
    }

    public BManagedInfoList toBManagedInfoList(){
        List<BManagedInfo> bManagedInfoList = new ArrayList<>();
        domainStringList.forEach(v -> bManagedInfoList.add(new BManagedInfo(v)));
        return new BManagedInfoList(bManagedInfoList);
    }
}
