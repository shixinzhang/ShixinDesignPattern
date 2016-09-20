package net.sxkeji.shixindesignpattern.observer;

import java.util.Observable;

/**
 * description: 消息发布者，继承 Observable
 * <br/>
 * author: shixinzhang
 * <br/>
 * data: 9/20/2016
 */
public class Writer extends Observable {
    private String mName;

    public Writer(String name) {
        mName = name;
    }

    /**
     * 在需要通知订阅者的时候调用 setChanged()方法，表明有更新
     * 然后提醒所有订阅者
     * @param msg
     */
    public void sendMsg(String msg) {
        //表示有更新
        setChanged();
        notifyObservers(msg);
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
