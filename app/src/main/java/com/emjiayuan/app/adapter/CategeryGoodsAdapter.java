package com.emjiayuan.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.emjiayuan.app.R;
import com.emjiayuan.app.Utils.GlideUtil;
import com.emjiayuan.app.entity.Product;
import com.emjiayuan.app.widget.MyImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyl on 2018年5月10日 09:52:49.
 */

public class CategeryGoodsAdapter extends BaseAdapter {
    private Context mContext;
    private static String TAG = "MenuAdapter";

    private List<Product> grouplists = new ArrayList<>();
    private LayoutInflater mInflater;

    public CategeryGoodsAdapter(Context mContext, List<Product> grouplists) {
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
            convertView = mInflater.inflate(R.layout.category_goods_item, null);
            holder.icon = convertView.findViewById(R.id.icon);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.yh = (TextView) convertView.findViewById(R.id.yh);
            convertView.setTag(holder);
        } else {// 如果之前已经显示过该页面，则用viewholder中的缓存直接刷屏
            holder = (ViewHolder) convertView.getTag();
        }

        Product item = grouplists.get(position);
        GlideUtil.loadImageViewLoding(mContext,item.getImages(),holder.icon,R.drawable.empty_img,R.drawable.empty_img);
//        Glide.with(mContext).load(item.getImages()).into(holder.icon);
//        holder.icon.setImageResource(R.drawable.img1);
        holder.name.setText(item.getName());
        holder.yh.setText("¥"+item.getPrice());

        return convertView;
    }

    public class ViewHolder {
        public MyImageView icon;
        public TextView name;
        public TextView yh;

    }
}
