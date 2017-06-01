package com.kintai.Ymd;

import com.kintai.Limitter.Limit;
import com.kintai.Limitter.Limitter;

public class Month {
    private Integer value;

    public Month(Integer value){
        Integer MIN = 1;
        Integer MAX = 12;
        new Limitter().run(value,new Limit(MIN,MAX));
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
