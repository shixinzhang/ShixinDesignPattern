package net.sxkeji.shixindesignpattern.staticproxy;

/**
 * 经纪人
 * Created by zhangshixin on 8/19/2016.
 */
public class Agent implements IStar {
    /**
     * 经纪人可以代表一个明星做一些决定
     */
    IStar mIStar;
    boolean mIsHappy;

    public Agent(IStar IStar) {
        mIStar = IStar;
    }

    /**
     * 代理可以在一定情况下拦截、修改被代理对象的行为，这里设置一个 “心情”的状态值
     * @param IStar
     * @param isHappy
     */
    public Agent(IStar IStar, boolean isHappy) {
        mIStar = IStar;
        mIsHappy = isHappy;
    }

    @Override
    public void attendTheShow() {
        mIStar.attendTheShow();

    }

    @Override
    public void loveWife() {
        if (mIsHappy) {
            mIStar.loveWife();
        } else {
            //当经纪人心情不好时，就会干坏事
            System.out.print("经纪人 照顾妻子");
        }
    }
}
