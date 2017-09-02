package net.sxkeji.shixindesignpattern.factory.simplefactory;

import net.sxkeji.shixindesignpattern.factory.beans.BMW;
import net.sxkeji.shixindesignpattern.factory.beans.BMWx3;
import net.sxkeji.shixindesignpattern.factory.beans.BMWx4;

/**
 * Description:
 * <br> 简单工厂，又称静态工厂方法模式，定义一个用于创建对象的接口。【只有一个工厂类】
 * <p>
 * 对于新产品的加入，工厂类是很被动的，违背开闭原则
 * <br> Created by shixinzhang on 17/9/2.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class SimpleFactory {
    public static BMW createCar(int type) {
        switch (type) {
            case 3:
                return new BMWx3();
            case 4:
                return new BMWx4();
//            case 5:
//                return new BMWx5();       //如果新增产品，就需要修改工厂类
            default:
                break;
        }
        return null;
    }
}
