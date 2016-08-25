package net.sxkeji.shixindesignpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 自定义的动态代理处理器
 * Created by zhangshixin on 8/24/2016.
 * Update on ${DATA}
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理对象
    private Object mTarget;

    public MyInvocationHandler(Object target) {
        super();
        this.mTarget = target;
    }

    /**
     * 方法拦截，进行一些额外操作
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        doThePreJob();

        Object result = method.invoke(mTarget, args);

        doTheAfterJob();
        return result;
    }

    private void doTheAfterJob() {
        System.out.println("doTheAfterJob");
    }

    private void doThePreJob() {
        System.out.println("doThePreJob");
    }

    /**
     * 获取代理
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), mTarget.getClass().getInterfaces(), this);
    }
}
