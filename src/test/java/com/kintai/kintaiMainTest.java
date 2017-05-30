package com.kintai;

import org.junit.Test;

import static org.junit.Assert.*;

public class kintaiMainTest {
    @Test
    public void inputの場合() throws Exception {
        String[] args = {"input", "aaa","bbb","ccc"};
        KintaiMain.main(args);
    }
    @Test
    public void totalの場合() throws Exception {
        String[] args = {"total", "aaa","bbb","ccc"};
        KintaiMain.main(args);
    }
    @Test(expected = RuntimeException.class)
    public void なんでもない場合() throws Exception {
        String[] args = {"hoge", "aaa","bbb","ccc"};
        KintaiMain.main(args);
    }

}