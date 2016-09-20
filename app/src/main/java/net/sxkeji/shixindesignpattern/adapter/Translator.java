package net.sxkeji.shixindesignpattern.adapter;

/**
 * description: 翻译
 * <br/>
 * author: shixinzhang
 * <br/>
 * data: 9/18/2016
 */
public class Translator implements Ukrainian {
    private Chinese mChinese;

    public Translator(Chinese chinese) {
        mChinese = chinese;
    }

    @Override
    public void sayUkrainian(String string) {
        mChinese.sayChinese(string);
    }
}
