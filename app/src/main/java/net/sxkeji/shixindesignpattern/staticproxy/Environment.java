package net.sxkeji.shixindesignpattern.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 外界环境，一般都是通过经纪人来接触明星
 * Created by zhangshixin on 8/19/2016.
 */
public class Environment {

    public static void main(final String[] args) {
        //王宝强，一位可爱、淳朴的明星，最早看的是他的《天下无贼》和《盲井》
        final Star baoqiang = new Star("王宝强");
//        //有个经纪人叫宋吉吉
//        Agent songJJ = new Agent(baoqiang, false);
//        songJJ.attendTheShow();
//        songJJ.loveWife();

        IStar star = (IStar) Proxy.newProxyInstance(baoqiang.getClass().getClassLoader(), new Class[]{IStar.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("loveWife")){
                    return method.invoke(new Agent(baoqiang,false),args);
                }else {
                    return method.invoke(baoqiang, args);
                }
            }
        });

        star.attendTheShow();
        star.loveWife();
    }
}
