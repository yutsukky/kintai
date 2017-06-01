package com.kintai.input;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class CSVLineCreateTest {
    @Test
    public void CSVLineを生成できるか() throws Exception {
        String[] str = {"input","20170529","0900","1800"};
        PickOut pickOut = new PickOut(str);
        Divide divide = new Divide(pickOut.getBehind());
        CSVLineCreate csvLineCreate = new CSVLineCreate(divide);
        Arrays.stream(csvLineCreate.getCsvLine().getArray()).forEach(System.out::println);
    }

}