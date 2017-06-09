package com.kintai.Domain.HM;

import com.kintai.Domain.Limit;
import com.kintai.Domain.Limitter;

public class Minute {
    private Integer value;

    public Minute(Integer value){
        Integer MIN = 0;
        Integer MAX = 59;
        new Limitter().run(value,new Limit(MIN,MAX));
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
