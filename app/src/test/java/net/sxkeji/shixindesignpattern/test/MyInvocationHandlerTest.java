package net.sxkeji.shixindesignpattern.test;

import net.sxkeji.shixindesignpattern.dynamicproxy.MyInvocationHandler;
import net.sxkeji.shixindesignpattern.staticproxy.IStar;
import net.sxkeji.shixindesignpattern.staticproxy.Star;

import org.junit.Test;

/**
 * 测试
 * Created by zhangshixin on 8/24/2016.
 */
public class MyInvocationHandlerTest {
    private MyInvocationHandler mMyInvocationHandler;

    @Test
    public void testInvoke() throws Exception {
        //被代理类
        IStar star = new Star("songxiaobao");
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(star);
        IStar agent = (IStar) myInvocationHandler.getProxy();
        agent.attendTheShow();

    }

    @Test
    public void testGetProxy() throws Exception {

    }
}