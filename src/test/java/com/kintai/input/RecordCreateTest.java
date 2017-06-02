package com.kintai.input;

import com.kintai.Behind;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordCreateTest {
    @Test
    public void getRecord() throws Exception {
        String[] args = {"20170528","0900","1800"};
        Behind behind = new Behind(args);
        Divide divide = new Divide(behind);
    }

}