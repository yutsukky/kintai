package com.kintai.input;

import com.kintai.Behind;
import com.kintai.Head;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickOut {
    private final Head head;
    private final Behind behind;

    public PickOut(String[] args) {
        this.head = new Head(args[0]);
        List<String> temp = new ArrayList<>(Arrays.asList(args));
        temp.remove(args[0]);
        this.behind = new Behind(temp.toArray(new String[temp.size()]));
    }

    public Head getHead() {
        return head;
    }

    public Behind getBehind() {
        return behind;
    }
}
