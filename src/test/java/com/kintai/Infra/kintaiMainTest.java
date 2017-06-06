package com.kintai.Infra;

import com.kintai.Infra.KintaiMain;
import org.junit.Test;

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