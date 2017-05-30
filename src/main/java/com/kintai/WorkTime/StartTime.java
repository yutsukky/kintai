package com.kintai.WorkTime;

public class StartTime {
    private Time start;

    public StartTime(Time start){
        final Integer START_LIMIT = 900;
        if(start.getTotal() > START_LIMIT){
            throw new RuntimeException("遅刻は即クビです．");
        }
        this.start = start;
    }

    public Time getStart() {
        return start;
    }

    public Integer getStartTotal(){
        return start.getTotal();
    }

    public Integer getHourValue(){
        return start.getHourValue();
    }

    public Integer getMinuteValue(){
        return start.getMinuteValue();
    }
}
