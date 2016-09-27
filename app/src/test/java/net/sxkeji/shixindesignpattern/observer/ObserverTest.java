package net.sxkeji.shixindesignpattern.observer;

import org.junit.Test;

/**
 * description:
 * <br/>
 * author: shixinzhang
 * <br/>
 * data: 9/20/2016
 */
public class ObserverTest {

    @Test
    public void testSendMsg() throws Exception {
        //创建一个斧头帮老大
        AxeGangBoss shixinzhang = new AxeGangBoss("张拭心");
        //创建两个小弟
        AxeGangPeople niefeng = new AxeGangPeople("聂风");
        AxeGangPeople bujingyun = new AxeGangPeople("步惊云");
        //老大觉得可以，收入麾下
        shixinzhang.addObserver(niefeng);
        shixinzhang.addObserver(bujingyun);
        //老大出事了，赶紧射箭！
        shixinzhang.sendMsg("我有难了，快来救我！");
    }
}