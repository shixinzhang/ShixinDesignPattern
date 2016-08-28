package net.sxkeji.shixindesignpattern.strategy;

/**
 * 写小说
 * Created by zhangshixin on 8/28/2016.
 */
public class WriteNovel {
    private Synopsis mSynopsis;     //故事梗概
    private String mMainActorName;  //主角名称

    /**
     * 梗概、内容都差不多确定后，换个名称就是另一部小说
     * @param mainName
     */
    public WriteNovel(String mainName){
        switch (mainName){
            case "张小凡":
                mSynopsis = new StoryB(mainName);
                break;
            case "杜维":
                mSynopsis = new StoryA(mainName);
                break;
            default:
                mSynopsis = new StoryB(mainName);
                break;
        }
    }

    /**
     * 获取小说内容
     */
    public void getNovelDetail(){
        mSynopsis.getContent();
    }
}
