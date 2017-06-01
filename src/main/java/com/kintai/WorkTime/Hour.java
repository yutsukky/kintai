package com.kintai.WorkTime;

import com.kintai.Limitter.Limit;
import com.kintai.Limitter.Limitter;

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
