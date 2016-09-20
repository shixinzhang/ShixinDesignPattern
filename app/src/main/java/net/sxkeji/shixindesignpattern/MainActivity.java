package net.sxkeji.shixindesignpattern;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ArrayList<String> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(new ArrayAdapter<>(
                this,
                R.layout.item_text,
                Arrays.asList("shi", "xin", "zhang")));

        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return mData.size();
            }

            @Override
            public Object getItem(int position) {
                return mData.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView = LayoutInflater.from(MainActivity.this)
                        .inflate(R.layout.item_sample, parent);
                return convertView;
            }
        });

        ObjectAnimator animator = ObjectAnimator.ofFloat(mListView, View.ALPHA, 0f, 1f);
        animator.setInterpolator(new AccelerateInterpolator());   //加速
        animator.setInterpolator(new OvershootInterpolator());    //跑过头又返回来

    }
}
