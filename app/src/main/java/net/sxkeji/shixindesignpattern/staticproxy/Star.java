package net.sxkeji.shixindesignpattern.staticproxy;

/**
 * 明星实体类
 * Created by zhangshixin on 8/19/2016.
 */
public class Star implements IStar {
    private String mName;

    public Star(String name) {
        mName = name;
    }

    @Override
    public void attendTheShow() {
        System.out.print( this.mName + " 参加演出 \n");
    }

    @Override
    public void loveWife() {
        System.out.print(this.mName + " 照顾了妻子");
    }
}
