package com.kintai.Infra.CSVLine;

import com.kintai.Infra.CSVWrite;
import com.kintai.Repository.WorkInfoRepository;
import com.kintai.Domain.WorkInfo;

public class CSVLineWrite implements WorkInfoRepository{
    public void execute(WorkInfo workInfo){
        String[] arr = new CSVLineCreate(workInfo).getCsvLineArray();
        String str = String.join(",",arr);
        new CSVWrite().execute(str);
    }
}
