package com.kintai.Infra;

import org.junit.Test;

import java.util.Arrays;

public class PickOutTest {

    @Test
    public void 引数の先頭を引っ張ってこれるか() throws Exception {
        String[] args = {"input", "20170518","0850","1930"};
        PickOut test = new PickOut(args);
        assert test.getHead().getString().equals("input");
    }

    @Test
    public void 第二引数以降を引っ張ってこれるか() throws Exception{
        String[] args = {"input", "20170518","0850","1930"};
        String[] temp = {"20170518","0850","1930"};
        PickOut test = new PickOut(args);
        assert Arrays.equals(temp,test.getBehind().getArgs());
    }

    @Test(expected = RuntimeException.class)
    public void 空配列渡されたときの反応(){
        String[] args = {};
        PickOut test = new PickOut(args);
    }

}