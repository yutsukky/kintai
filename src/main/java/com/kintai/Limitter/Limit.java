package com.kintai.Limitter;

public class Limit {
    private Integer min;
    private Integer max;

    public Limit(Integer min,Integer max){
        if(min >= max){
            throw new RuntimeException("最大値と最小値の大小関係が不正です．");
        }
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }
}
