package com.kintai.WorkTime;


public class WorkTimeTransform {
    private final Integer WORKTIME_LIMIT = 4;

    public WorkTime run(String raw1, String raw2){
        if(!WORKTIME_LIMIT.equals(raw1.length())){
            throw new RuntimeException("年月日の桁数が不正です．");
        }
        if(!WORKTIME_LIMIT.equals(raw2.length())){
            throw new RuntimeException("年月日の桁数が不正です．");
        }
        return new WorkTimeFactory().run(raw1,raw2);
    }

}
