package net.sxkeji.shixindesignpattern.dynamicproxy;

import org.junit.Test;

/**
 * Created by zhangshixin on 8/25/2016.
 * Update on ${DATA}
 */
public class AgentTest {

    @Test
    public void testMovieShow() throws Exception {
        Star huangBo = new Star("HuangBo");
        Agent agent = new Agent(huangBo);
        // 网上查到，2016年黄渤的片酬达到了 3000W ，我得敲多少年代码额呜呜
        agent.movieShow(10);
        agent.tvShow(5);
    }

    @Test
    public void testTvShow() throws Exception {

    }
}