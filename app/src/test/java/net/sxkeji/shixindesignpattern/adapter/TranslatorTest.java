package net.sxkeji.shixindesignpattern.adapter;

import org.junit.Test;

/**
 * description:
 * <br/>
 * author: shixinzhang
 * <br/>
 * data: 9/20/2016
 */
public class TranslatorTest {

    @Test
    public void testAdapterPattern(){
        Chinese me = new Chinese();
        Ukrainian ukrainianMan = new Translator(me);
        ukrainianMan.sayUkrainian("我爱你");
    }
}