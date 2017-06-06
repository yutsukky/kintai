package com.kintai.Service;

import com.kintai.Infra.Behind;
import com.kintai.Repository.WorkInfoRepository;
import com.kintai.Domain.WorkInfo;

public class WorkInfoSave {
    public void run(Behind behind, WorkInfoRepository repository){
        WorkInfo workInfo = new WorkInfo(behind);
        repository.execute(workInfo);
    }
}
