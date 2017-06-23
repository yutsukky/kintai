package com.kintai.Infra.CSVLine;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class CSVHashCreate {
    public HashMap<String,String[]> execute(BufferedReader br) throws IOException {
        HashMap<String,String[]> csvHash = new HashMap<>();
        String tmp;
        while ((tmp = br.readLine()) != null) {
            String array[] = tmp.split(",");
            csvHash.put(array[0],new String[]{array[1],array[2],array[3]});
        }
        return csvHash;
    }
}
