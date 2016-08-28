package net.sxkeji.shixindesignpattern.strategy;

import org.junit.Test;

/**
 *
 * Created by zhangshixin on 8/28/2016.
 */
public class WriteNovelTest {

    @Test
    public void testGetNovelDetail() throws Exception {
        WriteNovel writeNovel = new WriteNovel("张拭心");
        writeNovel.getNovelDetail();
    }
}