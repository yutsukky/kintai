package com.kintai.Domain.WorkTime;

public class EndTime {
    private Time end;

    public EndTime(Time end){
        this.end = end;
    }

    public Time getEnd() {
        return end;
    }

    public Integer getEndTotal(){
        return end.getTotal();
    }

    public Integer getHourValue(){
        return end.getHourValue();
    }

    public Integer getMinuteValue(){
        return end.getMinuteValue();
    }
}
