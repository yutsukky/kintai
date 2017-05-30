package com.kintai;

public class Arguments {
    private Head head;
    private Behind behind;

    public Arguments(Head head,Behind behind){
        this.head = head;
        this.behind = behind;
    }

    public Head getHead(){return head;}

    public Behind getBehind(){return behind;}
}
