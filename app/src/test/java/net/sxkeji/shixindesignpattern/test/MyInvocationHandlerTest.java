package net.sxkeji.shixindesignpattern.test;

import net.sxkeji.shixindesignpattern.dynamicproxy.IMovieStar;
import net.sxkeji.shixindesignpattern.dynamicproxy.ISingerStar;
import net.sxkeji.shixindesignpattern.dynamicproxy.ProxyHandler;
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
        ProxyHandler proxyHandler = new ProxyHandler(huangBo);
        IMovieStar agent = (IMovieStar) proxyHandler.getProxy();
        agent.movieShow(1000000000);
        agent.tvShow(100);

        //黄渤早年其实是个歌手！唱歌不得志只好去演戏，成为影帝后人们才关注他的歌声，真是个“看脸、看名”的世界
        ISingerStar singerAgent = (ISingerStar) proxyHandler.getProxy();
        singerAgent.sing(1024);

    }

    @Test
    public void testGetProxy() throws Exception {
    }
}