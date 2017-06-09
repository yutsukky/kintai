package com.kintai.Domain.Ymd;

import com.kintai.Domain.DataString.YMDString;

public class YMDTransform {
    private final Integer YMD_LIMIT = 8;

    public YMD run(YMDString ymdString){
        if(!YMD_LIMIT.equals(ymdString.getLength())){
            throw new RuntimeException("年月日の桁数が不正です．");
        }
        return new YMDFactory().run(ymdString);
    }
}
