package com.kintai.input;

import com.kintai.Behind;

public class KintaiInput {
    public void run(Behind behind){
        Divide divide = new Divide(behind);
        RecordCreate recordcreate = new RecordCreate(divide);
        new RecordWrite().run(recordcreate.getRecord());
    }
}
