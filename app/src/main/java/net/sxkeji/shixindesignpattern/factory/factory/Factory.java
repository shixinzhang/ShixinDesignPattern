package net.sxkeji.shixindesignpattern.factory.factory;

import net.sxkeji.shixindesignpattern.factory.beans.BMW;

/**
 * Description:
 * <br> 工厂方法模式，解决简单工厂新增商品需要修改工厂类的问题，如果新增商品，就新增工厂，而不是修改已有工厂
 * <p>
 * 为每一种产品单独提供一个工厂，好处是不必修改已有工厂，将密集在一个工厂的策略分开
 * 坏处是：使得对象的数量成倍增长。当产品种类非常多时，会出现大量的与之对应的工厂对象
 * <br> Created by shixinzhang on 17/9/2.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public abstract class Factory {
    public abstract BMW createCar();
}
