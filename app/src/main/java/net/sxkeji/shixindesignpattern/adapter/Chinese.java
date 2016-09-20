package net.sxkeji.shixindesignpattern.adapter;

/**
 * description:实际情况：只会中文
 * <br/>
 * author: shixinzhang
 * <br/>
 * data: 9/18/2016
 */
public class Chinese {
    /**
     * 说中文，比如：刘奶奶找牛奶奶买榴莲牛奶
     * @param string
     */
    void sayChinese(String string) {
        System.out.println("【中文版】 " + string);
    }
}
