package net.sxkeji.shixindesignpattern.staticproxy;

/**
 * 外界环境，一般都是通过经纪人来接触明星
 * Created by zhangshixin on 8/19/2016.
 */
public class Environment {

    public static void main(String[] args) {
        //王宝强，一位可爱、淳朴的明星，最早看的是他的《天下无贼》和《盲井》
        Star baoqiang = new Star("王宝强");
        //有个经纪人叫宋吉吉
        Agent songJJ = new Agent(baoqiang, false);
        songJJ.attendTheShow();
        songJJ.loveWife();
    }
}
