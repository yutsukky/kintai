package com.kintai.Domain.DataString;

import com.kintai.Infra.Behind;

public class BehindToDomainString {
    private final DomainString domainString;

    public BehindToDomainString(Behind behind){
        String[] array = {behind.getSecond(),behind.getFirst(),behind.getThird()};
        domainString = new DomainString(behind.getFirst(),array);
    }

    public DomainString getDomainString() {
        return domainString;
    }
}
