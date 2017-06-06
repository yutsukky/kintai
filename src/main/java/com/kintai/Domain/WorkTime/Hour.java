package com.kintai.Domain.WorkTime;

import com.kintai.Domain.Limit;
import com.kintai.Domain.Limitter;

public class Hour {
    private Integer value;

    public Hour(Integer value){
        Integer MIN = 0;
        Integer MAX = 23;
        new Limitter().run(value,new Limit(MIN,MAX));
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
