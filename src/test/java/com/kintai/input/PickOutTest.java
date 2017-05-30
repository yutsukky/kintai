package com.kintai.input;

import com.kintai.Behind;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PickOutTest {
    @Test
    public void 正常に引数の先頭を引っ張ってこれるか() throws Exception {
        String[] args = {"aiueo", "a","b","c"};
        PickOut test = new PickOut(args);
        assert test.getHead().equals("aiueo");
    }

    @Test
    public void 正常に第二引数以降を引っ張ってこれるか() throws Exception{
        String[] args = {"aiueo", "a","b","c"};
        String[] temp = {"a","b","c"};
        PickOut test = new PickOut(args);
        assert Arrays.equals(temp,test.getBehind().getBehind());
    }

    @Test(expected = RuntimeException.class)
    public void 空配列渡されたときの反応(){
        String[] args = {};
        PickOut test = new PickOut(args);
    }

}