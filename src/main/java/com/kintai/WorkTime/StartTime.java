package com.kintai.WorkTime;

public class StartTime {
    private Time start;

    public StartTime(Time start){
        final Integer HOUR_LIMIT = 9;
        final Integer MINUTE_LIMIT = 0;
        if(start.getHourValue() > HOUR_LIMIT){
            throw new RuntimeException("遅刻は即クビです．");
        }
        if(start.getHourValue().equals(HOUR_LIMIT) && (start.getMinuteValue() > MINUTE_LIMIT)){
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
