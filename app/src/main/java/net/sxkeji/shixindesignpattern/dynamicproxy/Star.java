package net.sxkeji.shixindesignpattern.dynamicproxy;

/**
 * 明星，可能是影歌双栖
 * Created by zhangshixin on 8/25/2016.
 */
public class Star implements IMovieStar{
    private String mName;

    public Star(String name) {
        mName = name;
    }

    @Override
    public void movieShow(int money) {
        System.out.println(mName + " 出演了部片酬 " + money + " 元的电影");
    }

    @Override
    public void tvShow(int money) {
        System.out.println(mName + " 出演了部片酬 " + money + " 元的电视剧");
    }
}
