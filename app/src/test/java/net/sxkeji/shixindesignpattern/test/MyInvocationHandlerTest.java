package net.sxkeji.shixindesignpattern.test;

import net.sxkeji.shixindesignpattern.dynamicproxy.IMovieStar;
import net.sxkeji.shixindesignpattern.dynamicproxy.MyInvocationHandler;
import net.sxkeji.shixindesignpattern.dynamicproxy.Star;

import org.junit.Test;

/**
 * 测试
 * Created by zhangshixin on 8/24/2016.
 */
public class MyInvocationHandlerTest {

    @Test
    public void testInvoke() throws Exception {
        Star huangBo = new Star("HuangBo");
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(huangBo);
        IMovieStar agent = (IMovieStar) myInvocationHandler.getProxy();
        agent.movieShow(1000000000);
        agent.tvShow(100);

    }

    @Test
    public void testGetProxy() throws Exception {

    }
}