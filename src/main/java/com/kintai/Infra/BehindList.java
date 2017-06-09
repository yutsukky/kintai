package com.kintai.Infra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BehindList {
    private List<Behind> behindList = new ArrayList<>();

    public BehindList(HashMap<String,String[]> csvHash){
        csvHash.entrySet().stream()
                .map(v -> new String[]{v.getKey(),v.getValue()[0],v.getValue()[1]})
                .forEach(v -> behindList.add(new Behind(v)));
    }

    public List<Behind> getBehindList(){
        return behindList;
    }

}
