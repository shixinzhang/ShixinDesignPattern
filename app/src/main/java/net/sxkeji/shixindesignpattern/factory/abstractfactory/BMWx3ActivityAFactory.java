package net.sxkeji.shixindesignpattern.factory.abstractfactory;

import net.sxkeji.shixindesignpattern.factory.beans.BMW;
import net.sxkeji.shixindesignpattern.factory.beans.BMWx3;
import net.sxkeji.shixindesignpattern.factory.beans.CarActivity;
import net.sxkeji.shixindesignpattern.factory.beans.CarActivityA;

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

public class BMWx3ActivityAFactory extends AbstractFactory{
    @Override
    public BMW getCar() {
        return new BMWx3();
    }

    @Override
    public CarActivity getActivity() {
        return new CarActivityA();
    }
}
