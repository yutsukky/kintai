package com.kintai.Infra;

public class Behind {
    private final String[] args;

    public Behind(String[] args){
        this.args = args;
    }

    public String[] getArgs() {
        return args;
    }

    public String getFirst(){
        return args[0];
    }

    public String getSecond(){
        return args[1];
    }

    public String getThird(){
        return args[2];
    }
}
