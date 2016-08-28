package net.sxkeji.shixindesignpattern.strategy;

/**
 * 故事 A ，跳舞的恶魔法则
 * Created by zhangshixin on 8/27/2016.
 */
public class StoryA implements Synopsis {
    private String mName;

    public StoryA(String name) {
        mName = name;
    }

    @Override
    public void badStart() {
        System.out.println(mName + " 无故穿越，因为没有魔法能力，成为将军家的废物，不受待见。");
    }

    @Override
    public void adventure() {
        System.out.println(mName + " 因为意外来到恶魔岛，在恶魔岛上遇见了恶魔的仆人，获得了一直想要的使用魔法的能力");
    }

    @Override
    public void winABattle() {
        System.out.println(mName + " 协助辰皇子夺得了帝国的权力，成为郁金香公爵");
    }

    @Override
    public void growFast() {
        System.out.println(mName + " 先后在曾曾曾祖母、恶魔仆人、圣骑士、魔导师的帮助下飞速成长");
    }

    @Override
    public void manyFights() {
        System.out.println(mName + " 建立魔法学院和魔法学会，与魔法工会分庭抗礼。坐拥西北十万雄兵，歼灭西北军团，打退草原人，带领人类全族击退北方的异族军队。");
    }

    @Override
    public void succeed() {
        System.out.println(mName + " 娶了女皇为妻子，成为罗兰帝国的英雄。");
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
