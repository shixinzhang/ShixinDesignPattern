package net.sxkeji.shixindesignpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * description: 斧头帮小弟，订阅者，实现 Observer 接口
 * <br/>
 * author: shixinzhang
 * <br/>
 * data: 9/20/2016
 */
public class AxeGangPeople implements Observer {
    String mName;

    public AxeGangPeople(String name){
        mName = name;
    }

    /**
     * 必须实现的方法，当消息发布者发出通知后，会调用这个方法
     * @param observable
     * @param data
     */
    @Override
    public void update(Observable observable, Object data) {
        AxeGangBoss writer;
        if (observable instanceof AxeGangBoss) {
            writer = (AxeGangBoss) observable;
            System.out.println(getName() + " 收到来自 " + writer.getName() + " 的消息: " + data.toString());
        }
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
