package net.sxkeji.shixindesignpattern.dynamicproxy;

/**
 * 歌星，定义歌星的基本行为
 * Created by zhangshixin on 8/25/2016.
 * Update on ${DATA}
 */
public interface ISingerStar {
    /**
     * 唱歌
     * @param number 歌曲数
     */
    void sing(int number);

    /**
     * 写专辑
     * @param number 专辑歌曲数
     */
    void writeAlbum(int number);
}
