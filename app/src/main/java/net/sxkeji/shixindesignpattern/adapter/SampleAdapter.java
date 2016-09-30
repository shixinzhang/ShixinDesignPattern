package net.sxkeji.shixindesignpattern.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.sxkeji.shixindesignpattern.DesignPatternBeans;
import net.sxkeji.shixindesignpattern.R;

import java.util.List;

/**
 * description: 设计模式列表 adapter
 * <br/>
 * author: shixinzhang
 * <br/>
 * data: 9/20/2016
 */
public class SampleAdapter extends BaseAdapter {
    private List<DesignPatternBeans> mData;
    private Context mContext;

    public SampleAdapter(Context context, List<DesignPatternBeans> dataList) {
        mContext = context;
        mData = dataList;
    }

    public void addData(DesignPatternBeans data) {
        if (mData != null) {
            mData.add(data);
            notifyDataSetChanged();
        }
    }

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
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_sample, null);
        }
        TextView tvItem = (TextView) convertView.findViewById(R.id.tv_item);
        tvItem.setText(mData.get(position).getName());
//        Linkify.addLinks(tvItem, Linkify.ALL);
        tvItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view = new Intent();
                view.setAction(Intent.ACTION_VIEW);
                view.setData(Uri.parse(mData.get(position).getUrl()));
                mContext.startActivity(view);
            }
        });
        return convertView;
    }
}
