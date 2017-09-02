package net.sxkeji.shixindesignpattern.factory;

import net.sxkeji.shixindesignpattern.factory.abstractfactory.AbstractFactory;
import net.sxkeji.shixindesignpattern.factory.abstractfactory.BMWx3ActivityAFactory;
import net.sxkeji.shixindesignpattern.factory.abstractfactory.BMWx4ActivityBFactory;
import net.sxkeji.shixindesignpattern.factory.beans.BMW;
import net.sxkeji.shixindesignpattern.factory.beans.CarActivity;

import org.junit.Test;

/**
 * Description:
 * <br>
 * <p>
 * <br> Created by shixinzhang on 17/9/2.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory() {
//        AbstractFactory factory = new BMWx3ActivityAFactory();
        AbstractFactory factory = new BMWx4ActivityBFactory();
        BMW car = factory.getCar();
        CarActivity activity = factory.getActivity();
    }
}
