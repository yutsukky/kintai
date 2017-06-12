package com.kintai.Domain;

import com.kintai.Domain.DataString.DomainString;
import com.kintai.Infra.Behind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DomainStringList {
    private List<DomainString> domainStringList = new ArrayList<>();

    public DomainStringList(HashMap<String,String[]> csvHash){
        csvHash.entrySet().stream()
                .map(v -> new DomainString(v.getKey(),v.getValue()))
                .forEach(v -> domainStringList.add(v));
    }

    public List<DomainString> getDomainStringList(){
        return domainStringList;
    }

}
