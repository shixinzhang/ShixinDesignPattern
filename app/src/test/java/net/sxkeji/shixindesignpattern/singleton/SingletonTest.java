package net.sxkeji.shixindesignpattern.singleton;

import android.os.SystemClock;

import org.junit.Test;

/**
 * Description:
 * <br>
 * <p>
 * <br> Created by shixinzhang on 17/9/3.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class SingletonTest {

    @Test
    public void testSingleton(){
//        new StaticInnerSingleton();

        StaticInnerSingleton instance = StaticInnerSingleton.getInstance();
        System.out.println(instance);

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        StaticInnerSingleton instance1 = StaticInnerSingleton.getInstance();
        System.out.println(instance1);
    }
}
