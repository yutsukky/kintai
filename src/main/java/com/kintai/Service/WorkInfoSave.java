package com.kintai.Service;

import com.kintai.Domain.DataString.BehindToDomainString;
import com.kintai.Domain.DataString.DomainString;
import com.kintai.Repository.WorkInfoRepository;
import com.kintai.Domain.WorkInfo;

public class WorkInfoSave {
    public void run(DomainString domainString, WorkInfoRepository repository){
        WorkInfo workInfo = new WorkInfo(domainString);
        repository.execute(workInfo);
    }
}
