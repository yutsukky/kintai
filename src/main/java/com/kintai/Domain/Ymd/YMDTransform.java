package com.kintai.Domain.Ymd;

public class YMDTransform {
    private final Integer YMD_LIMIT = 8;

    public YMD run(String raw){
        if(!YMD_LIMIT.equals(raw.length())){
            throw new RuntimeException("年月日の桁数が不正です．");
        }
        return new YMDFactory().run(raw);
    }
}
