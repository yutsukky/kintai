package com.kintai.input;

import com.kintai.Behind;

public class KintaiInput {
    public void run(Behind behind){
        Divide divide = new Divide(behind);
        CSVLineCreate csvLineCreate = new CSVLineCreate(divide);
        new CSVLineWrite().run(csvLineCreate.getCsvLine());
    }
}
