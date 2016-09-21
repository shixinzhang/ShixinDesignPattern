package net.sxkeji.shixindesignpattern.adapter;

/**
 * description: 类适配器下的翻译中介
 * <br/>
 * author: shixinzhang
 * <br/>
 * data: 9/20/2016
 */
public class ClassTranslator extends Chinese implements Ukrainian {
    @Override
    public void sayUkrainian(String string) {
        sayChinese(string);
    }
}
