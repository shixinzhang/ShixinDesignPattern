package net.sxkeji.shixindesignpattern;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import net.sxkeji.shixindesignpattern.adapter.SampleAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private List<String> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(new ArrayAdapter<>(
                this,
                R.layout.item_text,
                Arrays.asList("shi", "xin", "zhang")));

        mData.add("shi");
        mData.add("xin");
        mData.add("zhang");

        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(new SampleAdapter(this, mData));

        ObjectAnimator animator = ObjectAnimator.ofFloat(mListView, View.ALPHA, 0f, 1f);
        animator.setInterpolator(new AccelerateInterpolator());   //加速
        animator.setInterpolator(new OvershootInterpolator());    //跑过头又返回来

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //获取在屏幕的位置
        int [] xy = new int[2];
        mListView.getLocationInWindow(xy);
        System.out.println("tvItem in window location x:" + xy[0] + " / y:"+xy[1]);
        mListView.getLocationOnScreen(xy);
        System.out.println("tvItem on screen location x:" + xy[0] + " / y:"+xy[1]);
    }
}
