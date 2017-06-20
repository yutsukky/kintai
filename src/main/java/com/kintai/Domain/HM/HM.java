package com.kintai.Domain.HM;

import java.time.LocalTime;

public class HM {
    private LocalTime localTime;

    public HM(LocalTime localTime){
        this.localTime = localTime;
    }

    public LocalTime getLocalTime(){
        return localTime;
    }

    public HM minus(HM amount){
        LocalTime tmp = localTime.minusMinutes(amount.getMinuteValue());
        return new HM(tmp.minusHours(amount.getHourValue()));
    }

    public boolean isBofore(HM other) {
        return localTime.isBefore(other.localTime);
    }

    public Hour getHour(){ return new Hour(getHourValue()); }

    public Minute getMinute(){ return new Minute(getMinuteValue()); }

    public String getHMString(){
        return String.format("%02d%02d",getHourValue(),getMinuteValue());
    }

    public Integer getHourValue() {
        return localTime.getHour();
    }

    public Integer getMinuteValue() {
        return localTime.getMinute();
    }

    public Integer getTotal(){
        return getHourValue() * 100 + getMinuteValue();
    }
}
