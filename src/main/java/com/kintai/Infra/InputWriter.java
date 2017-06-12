package com.kintai.Infra;

import com.kintai.Domain.DataString.BehindToDomain;
import com.kintai.Infra.CSVLine.CSVLineWrite;
import com.kintai.Repository.WorkInfoRepository;
import com.kintai.Service.WorkInfoSave;

public class InputWriter {
    public void run(Behind behind){
        WorkInfoRepository repository = new CSVLineWrite();
        new WorkInfoSave().run(new BehindToDomain(behind),repository);
    }
}
