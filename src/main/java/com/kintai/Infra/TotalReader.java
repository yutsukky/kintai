package com.kintai.Infra;

import com.kintai.Domain.DataString.DomainStringList;
import com.kintai.Infra.CSVLine.CSVRead;
import com.kintai.Service.ManagedInfoOutput;

public class TotalReader {
    public void run(){
        DomainStringList domainStringList = new DomainStringList(new CSVRead().execute());
        new ManagedInfoOutput().run(domainStringList);
    }
}
