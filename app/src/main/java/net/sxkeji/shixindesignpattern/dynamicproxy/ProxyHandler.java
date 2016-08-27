package net.sxkeji.shixindesignpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 自定义的动态代理处理器
 * Created by zhangshixin on 8/24/2016.
 * Update on ${DATA}
 */
public class ProxyHandler implements InvocationHandler {
    //被代理对象
    private Object mTarget;

    public ProxyHandler(Object target) {
        this.mTarget = target;
    }

    /**
     * 方法拦截，可以进行一些额外操作
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("movieShow") || methodName.equals("tvShow")) {
            if (args[0] instanceof Integer && ((int) args[0]) < 300000000) {
                System.out.println(((int) args[0]) + "块钱？！你雇 HuangZiTao 演去吧！");
                return null;
            }
        }
        Object result = method.invoke(mTarget, args);

        return result;
    }

    /**
     * 获取代理
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(mTarget.getClass().getClassLoader(), mTarget.getClass().getInterfaces(), this);
    }
}
