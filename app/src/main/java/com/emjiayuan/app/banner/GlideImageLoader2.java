package com.emjiayuan.app.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.UnicornImageLoader;

public class GlideImageLoader2 implements UnicornImageLoader {
    private Context context;

    public GlideImageLoader2(Context context) {
        this.context = context.getApplicationContext();
    }

    @Nullable
    @Override
    public Bitmap loadImageSync(String uri, int width, int height) {
        return null;
    }

    @Override
    public void loadImage(String uri, int width, int height, final ImageLoaderListener listener) {
        if (width <= 0 || height <= 0) {
            width = height = Integer.MIN_VALUE;
        }
        RequestBuilder<Bitmap> requestBuilder = Glide.with(context).asBitmap();
        requestBuilder.load(uri).into(new SimpleTarget<Bitmap>(width, height) {


            @Override
            public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                if (listener != null) {
                    listener.onLoadComplete(resource);
                }
            }

            @Override
            public void onLoadFailed(@Nullable Drawable errorDrawable) {
                super.onLoadFailed(errorDrawable);
                if (listener != null) {
//                    listener.onLoadFailed();
                }
            }
        });
    }
}