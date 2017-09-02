package net.sxkeji.shixindesignpattern.factory.factory;

import net.sxkeji.shixindesignpattern.factory.beans.BMW;
import net.sxkeji.shixindesignpattern.factory.beans.BMWx4;

/**
 * Description:
 * <br> 专门创建宝马 x4 的工厂
 * <p>
 * <br> Created by shixinzhang on 17/9/2.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class BMWx4Factory extends Factory {
    @Override
    public BMW createCar() {
        return new BMWx4();
    }
}
