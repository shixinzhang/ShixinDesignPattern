package net.sxkeji.shixindesignpattern.strategy;

/**
 * 网络玄幻小说的故事梗概接口
 * 固定的一些套路
 * Created by zhangshixin on 8/27/2016.
 */
public interface Synopsis {
    /**
     * 穷困潦倒的开始
     */
    void badStart();

    /**
     * 突然有天遇到神人/捡到神器，实力大涨
     */
    void adventure();

    /**
     * 在一场战斗中以弱胜强
     */
    void winABattle();

    /**
     * 从此飞速成长
     */
    void growFast();

    /**
     * 组团刷怪,经历九死一生（主角怎么也死不了）
     */
    void manyFights();

    /**
     * 最终功成名就，妻妾成群
     */
    void succeed();

    /**
     * 组合起来就是小说内容
     */
    void getContent();
}
