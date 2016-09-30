package net.sxkeji.shixindesignpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import net.sxkeji.shixindesignpattern.adapter.SampleAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private List<DesignPatternBeans> mData = new ArrayList<>();
    private String[] mNameArray = {"单一职责原则： 一个萝卜一个坑", "开放封闭原则： 一国两制  ",
            "里氏替换原则： 狸猫换太子", "依赖倒置原则： 老板是如何减轻负担的",
            "接口隔离原则： 辅导班的因材施教 ", "单例模式：茴字的几种写法",
            "代理模式：女朋友这么漂亮，你缺经纪人吗？", "动态代理：1 个经纪人如何代理 N 个明星",
            "策略模式：网络小说的固定套路", " Android 中的那些策略模式",
            "适配器模式 : 农村小伙娶乌克兰美女", "观察者模式 : 一支穿云箭，千军万马来相见",
            "最熟悉的陌生人：ListView 中的观察者模式"
    };
    private String[] mLinksArray = {"http://blog.csdn.net/u011240877/article/details/52177033", "http://blog.csdn.net/u011240877/article/details/52187631",
            "http://blog.csdn.net/u011240877/article/details/52187810", "(http://blog.csdn.net/u011240877/article/details/52194373",
            "http://blog.csdn.net/u011240877/article/details/52213659",
            "http://blog.csdn.net/u011240877/article/details/46988219", "http://blog.csdn.net/u011240877/article/details/52264283",
            "http://blog.csdn.net/u011240877/article/details/52334547", "http://blog.csdn.net/u011240877/article/details/52346671",
            "http://blog.csdn.net/u011240877/article/details/52493408", "http://blog.csdn.net/u011240877/article/details/52601040",
            "http://blog.csdn.net/u011240877/article/details/52683558", "http://blog.csdn.net/u011240877/article/details/52683711"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list_view);

        for (int i = 0; i < mNameArray.length; i++) {
            DesignPatternBeans designPatternBeans = new DesignPatternBeans();
            designPatternBeans.setName(mNameArray[i]);
            designPatternBeans.setUrl(mLinksArray[i]);
            mData.add(designPatternBeans);
        }
        SampleAdapter adapter = new SampleAdapter(this, mData);

        mListView.setAdapter(adapter);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //获取在屏幕的位置
        int[] xy = new int[2];
        mListView.getLocationInWindow(xy);
        System.out.println("tvItem in window location x:" + xy[0] + " / y:" + xy[1]);
        mListView.getLocationOnScreen(xy);
        System.out.println("tvItem on screen location x:" + xy[0] + " / y:" + xy[1]);
    }
}
