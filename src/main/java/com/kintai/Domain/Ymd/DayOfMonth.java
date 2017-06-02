package com.kintai.Domain.Ymd;

import com.kintai.Domain.Limit;
import com.kintai.Domain.Limitter;

public class DayOfMonth {
    private Integer value;

    public DayOfMonth(Integer value){
        Integer MIN = 1;
        Integer MAX = 31;
        new Limitter().run(value,new Limit(MIN,MAX));
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
