package com.kintai.Domain.HM;

import com.kintai.Domain.Limit;
import com.kintai.Domain.Limitter;

public class Hour {
    private final Integer value;

    public Hour(Integer value){
        Integer MIN = 0;
        Integer MAX = 48;
        new Limitter().run(value,new Limit(MIN,MAX));
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
