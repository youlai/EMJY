package com.emjiayuan.app.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.emjiayuan.app.R;
import com.emjiayuan.app.Utils.MyUtils;
import com.emjiayuan.app.activity.address.ModifyAddressActivity;
import com.emjiayuan.app.entity.Product;

import java.util.ArrayList;

/**
 * Created by cyl on 2018年5月10日 09:52:49.
 */

public class TopUpAdapter extends BaseAdapter {
    private Context mContext;


    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
        notifyDataSetChanged();
    }

    private int selected=-1;

    private ArrayList<Product> grouplists = new ArrayList<>();
    private LayoutInflater mInflater;

    public TopUpAdapter(Context mContext, ArrayList<Product> grouplists) {
        super();
        this.mContext = mContext;
        this.grouplists = grouplists;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
//        return 6;
        return grouplists.size();
    }

    @Override
    public Product getItem(int position) {
        return grouplists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {// 如果是第一次显示该页面(要记得保存到viewholder中供下次直接从缓存中调用)
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.top_up_item, null);
            holder.value = (TextView) convertView.findViewById(R.id.value);
            holder.content = (TextView) convertView.findViewById(R.id.content);
            holder.item = (LinearLayout) convertView.findViewById(R.id.item);
            convertView.setTag(holder);
        } else {// 如果之前已经显示过该页面，则用viewholder中的缓存直接刷屏
            holder = (ViewHolder) convertView.getTag();
        }

        Product item = grouplists.get(position);
        holder.value.setText(item.getGiftjifen()+"元");
        holder.content.setText(item.getName());
        if (selected==position){
            holder.item.setBackgroundResource(R.drawable.top_up_check_bg);
            holder.value.setTextColor(Color.parseColor("#ffffff"));
        }else{
            holder.item.setBackgroundResource(R.drawable.top_up_bg);
            holder.value.setTextColor(Color.parseColor("#000000"));
        }

        return convertView;
    }

    public class ViewHolder {
        public TextView value;
        public TextView content;
        public LinearLayout item;

    }
}