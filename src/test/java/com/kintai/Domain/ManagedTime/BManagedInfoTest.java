package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.DataString.DomainString;
import org.junit.Test;

import static org.junit.Assert.*;

public class BManagedInfoTest {
    @Test
    public void オブジェクト生成テスト(){
        String[] args = {"0900","20170617","0235"};
        DomainString domainString = new DomainString("20170616",args);
        BManagedInfo bManagedInfo = new BManagedInfo(domainString);
        Integer actualHour = bManagedInfo.getManagedTime().getActualTime().getHourValue();
        Integer actualMinute = bManagedInfo.getManagedTime().getActualTime().getMinuteValue();
        Integer overHour = bManagedInfo.getManagedTime().getOverTime().getHourValue();
        Integer overMinute = bManagedInfo.getManagedTime().getOverTime().getMinuteValue();
        System.out.println("Actual " + actualHour + ":" + actualMinute);
        System.out.println("Over " + overHour + ":" + overMinute);
    }

}