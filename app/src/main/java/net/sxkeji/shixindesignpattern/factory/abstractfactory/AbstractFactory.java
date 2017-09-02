package net.sxkeji.shixindesignpattern.factory.abstractfactory;

import net.sxkeji.shixindesignpattern.factory.beans.BMW;
import net.sxkeji.shixindesignpattern.factory.beans.CarActivity;

/**
 * Description:
 * <br> 抽象工厂
 * 抽象工厂模式和工厂方法模式的区别就在于需要创建对象的复杂程度上
 * <p>
 * 使用抽象工厂模式还要满足一下条件：
 * 1)系统中有多个产品族，而系统一次只可能消费其中一族产品。
 * 2)同属于同一个产品族的产品以其使用。
 * <p>
 * 假设不同汽车关联着不同的活动，那工厂出一个车的同时还要提供这个车的活动信息
 * <p>
 * 其实就是将产品的多种组成（A + B）簇组合到一个工厂（生产 A 和 B），不同产品有不同工厂（生产不同的 A 和 B）
 * <p>
 * <p>这样具体的创建实例过程与客户端分离
 * <br> Created by shixinzhang on 17/9/2.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public abstract class AbstractFactory {
    public abstract BMW getCar();

    public abstract CarActivity getActivity();
}
