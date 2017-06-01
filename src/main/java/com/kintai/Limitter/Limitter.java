package com.kintai.Limitter;

public class Limitter {
    public void run(Integer value,Limit limit){
        if(value < limit.getMin()){
            throw new RuntimeException("下限値以下の入力があります．");
        }
        if(value > limit.getMax()){
            throw new RuntimeException("上限値以上の入力があります．");
        }
    }
}
