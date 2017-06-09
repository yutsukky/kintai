package com.kintai.Service;

import com.kintai.Domain.BehindToDomain;
import com.kintai.Infra.Behind;
import com.kintai.Repository.WorkInfoRepository;
import com.kintai.Domain.WorkInfo;

public class WorkInfoSave {
    public void run(BehindToDomain behindToDomain, WorkInfoRepository repository){
        WorkInfo workInfo = new WorkInfo(behindToDomain);
        repository.execute(workInfo);
    }
}
