package net.sxkeji.shixindesignpattern.singleton;

/**
 * Description:
 * <br> 单例模式的静态内部类实现
 * <p>
 * 好处：
 * 1.不会有重排序
 * 2.调用时才加载，懒加载
 * 3.静态内部类只会被加载一次之所以线程安全是因为类的加载过程是线程安全的
 * <p>
 * <br> Created by shixinzhang on 17/9/3.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class StaticInnerSingleton {
    private StaticInnerSingleton() {
        System.out.println("Singleton " + System.currentTimeMillis());
    }

    private static class InstanceHolder {
        static StaticInnerSingleton mInstance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return InstanceHolder.mInstance;
    }
}
