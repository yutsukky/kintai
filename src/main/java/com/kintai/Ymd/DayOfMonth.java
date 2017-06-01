package com.kintai.Ymd;

import com.kintai.Limitter.Limit;
import com.kintai.Limitter.Limitter;

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
