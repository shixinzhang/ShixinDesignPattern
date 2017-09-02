package net.sxkeji.shixindesignpattern.factory;

import net.sxkeji.shixindesignpattern.factory.beans.BMW;
import net.sxkeji.shixindesignpattern.factory.simplefactory.SimpleFactory;

import org.junit.Test;

/**
 * Description:
 * <br> 简单工厂的测试
 * <p>
 * <br> Created by shixinzhang on 17/9/2.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class SimpleFactoryTest {
    @Test
    public void testSimpleFactory(){
        BMW car = SimpleFactory.createCar(3);
    }
}
