package net.sxkeji.shixindesignpattern.strategy;

/**
 * 故事 B ,诛仙
 * Created by zhangshixin on 8/27/2016.
 */
public class StoryB implements Synopsis {
    private String mName;

    public StoryB(String name) {
        mName = name;
    }

    @Override
    public void badStart() {
        System.out.println(mName + " 全村被屠，投入青云七脉中人数最少的大竹峰。");
    }

    @Override
    public void adventure() {
        System.out.println(mName + " 在一次伐竹过程中，为追一只三眼灵猴，入青云山深处得到了烧火棍。");
    }

    @Override
    public void winABattle() {
        System.out.println(mName + " 在七脉会武中侥幸进了前 4，和陆雪琪等人一起万蝠古窟历练。");
    }


    @Override
    public void growFast() {
        System.out.println(mName + " 在魔教十年，深得鬼王器重和真传。");
    }

    @Override
    public void manyFights() {
        System.out.println(mName + " 经历无数战斗，先是为鬼王卖命，后来与鬼王大战。");
    }

    @Override
    public void succeed() {
        System.out.println("天地不仁，以万物为刍狗。 " + mName +" 最后成为最有资格拥有天书的人。");
    }


    @Override
    public void getContent() {
        badStart();
        adventure();
        winABattle();
        growFast();
        manyFights();
        succeed();
    }
}
