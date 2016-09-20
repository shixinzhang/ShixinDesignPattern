package net.sxkeji.shixindesignpattern.observer;

import org.junit.Test;

/**
 * description:
 * <br/>
 * author: shixinzhang
 * <br/>
 * data: 9/20/2016
 */
public class WriterTest {

    @Test
    public void testSendMsg() throws Exception {
        Reader dengchao = new Reader("邓超");
        Reader zhangjie = new Reader("张杰");
        Writer shixinzhang = new Writer("张拭心");

        shixinzhang.addObserver(dengchao);
        shixinzhang.addObserver(zhangjie);

        shixinzhang.sendMsg("我写了本新书《妻管严的职业素养》，欢迎阅读!");
    }
}