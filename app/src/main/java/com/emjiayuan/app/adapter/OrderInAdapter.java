package com.emjiayuan.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.emjiayuan.app.R;
import com.emjiayuan.app.entity.OrderComfirm.ProductsBean;
import com.emjiayuan.app.entity.OrderComfirm.ProductsBean;
import com.emjiayuan.app.entity.OrderComfirm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyl on 2018年5月10日 09:52:49.
 */

public class OrderInAdapter extends BaseAdapter {
    private Context mContext;
    private List<OrderComfirm.ProductsBean> grouplists = new ArrayList<>();
    private LayoutInflater mInflater;
    private OrderComfirm orderComfirm;
    public OrderInAdapter(Context mContext, OrderComfirm orderComfirm) {
        super();
        this.mContext = mContext;
        this.grouplists = orderComfirm.getProducts();
        this.orderComfirm=orderComfirm;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return grouplists.size();
//        return 1;
    }

    @Override
    public OrderComfirm.ProductsBean getItem(int position) {
        return grouplists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
//        final  ViewHolder holder= new ViewHolder();
        ViewHolder holder= null;
        if (convertView == null) {// 如果是第一次显示该页面(要记得保存到holder中供下次直接从缓存中调用)
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.order_item_in, null);
            holder.icon = (ImageView) convertView.findViewById(R.id.icon);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.price = (TextView) convertView.findViewById(R.id.price);
            holder.num = (TextView) convertView.findViewById(R.id.num);
            convertView.setTag(holder);
        } else {// 如果之前已经显示过该页面，则用holder中的缓存直接刷屏
            holder = (ViewHolder) convertView.getTag();
        }

        OrderComfirm.ProductsBean item = grouplists.get(position);
        Glide.with(mContext).load(item.getImages()).into(holder.icon);
        holder.name.setText(item.getName());

        if ("JF".equals(orderComfirm.getPromotiontype())){
            holder.price.setText(orderComfirm.getPromotionvalue()+"积分");
        }else{
            holder.price.setText("¥"+item.getBuyprice());
        }
        holder.num.setText("X"+item.getBuynum());

        return convertView;
    }
    public class ViewHolder {
        public ImageView icon;
        public TextView name;
        public TextView price;
        public TextView num;
    }
}
