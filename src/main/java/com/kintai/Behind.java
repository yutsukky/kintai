package com.kintai;

public class Behind {
    private String[] behind;

    public Behind(String[] args){
        this.behind = args;
    }

    public String[] getBehind() {
        return behind;
    }

    public String getFirst(){
        return behind[0];
    }

    public String getSecond(){
        return behind[1];
    }

    public String getThird(){
        return behind[2];
    }
}
