package com.eztcn.user.hall.utils;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.Glide;
import com.eztcn.user.R;
import com.eztcn.user.hall.common.BlurTransformation;
import com.eztcn.user.hall.common.RoundTransformation;

import java.io.File;

/**
 * @Author: lizhipeng
 * @Data: 16/5/25 上午9:30
 * @Description: Glide 图片框架封装
 */
public class GlideUtils {
    /**
     * 默认glide，不做任何处理
     *
     * @param context
     * @param url
     * @param view
     */
    public static void intoDefault(Context context, String url, ImageView view) {
        Glide.with(context)
                .load(url)
                .into(view);
    }
    /**
     * 默认glide，不做任何处理
     *
     * @param context
     * @param id
     * @param view
     */
    public static void intoDefault(Context context, int id, ImageView view) {
        Glide.with(context)
                .load(id)
                .into(view);
    }

    /**
     * glide 从字符串中加载图片（网络地址或者本地地址）
     *
     * @param context
     * @param url
     * @param view
     */
    public static void into(Context context, String url, ImageView view) {
        Glide.with(context).load(url)
                .placeholder(R.drawable.new_icon_default_img)
                .crossFade()//淡入淡出
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }

    /**
     * glide 从资源ID中加载图片
     *
     * @param context
     * @param resourceId
     * @param view
     */
    public static void into(Context context, int resourceId, ImageView view) {
        Glide.with(context).load(resourceId)
                .placeholder(R.drawable.new_icon_default_img)
                .crossFade()//淡入淡出
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }

    /**
     * glide 从文件中加载图片
     *
     * @param context
     * @param file
     * @param view
     */
    public static void into(Context context, File file, ImageView view) {
        Glide.with(context).load(file)
                .placeholder(R.drawable.new_icon_default_img)
                .crossFade()//淡入淡出
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }

    /**
     * glide 从URI中加载图片
     *
     * @param context
     * @param uri
     * @param view
     */
    public static void into(Context context, Uri uri, ImageView view) {
        Glide.with(context).load(uri)
                .placeholder(R.drawable.new_icon_default_img)
                .crossFade()//淡入淡出
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }

    /**
     * glide 通过指定的大小从字符串中加载图片（网络地址或者本地地址）
     *
     * @param context
     * @param url
     * @param view
     * @param width
     * @param height
     */
    public static void into(Context context, String url, ImageView view, int width, int height) {
        DrawableTypeRequest<String> request = Glide.with(context).load(url);
        if (width > 0 && height > 0) {
            request.override(width, height);
        }
        request.placeholder(R.drawable.new_icon_default_img)
                .crossFade()
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }

    /**
     * glide 通过指定的大小从资源ID中加载图片
     *
     * @param context
     * @param resourceId
     * @param view
     * @param width
     * @param height
     */
    public static void into(Context context, int resourceId, ImageView view, int width, int height) {
        DrawableTypeRequest<Integer> request = Glide.with(context).load(resourceId);
        if (width > 0 && height > 0) {
            request.override(width, height);
        }
        request.placeholder(R.drawable.new_icon_default_img)
                .crossFade()
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }

    /**
     * glide 通过指定的大小从文件中加载图片
     *
     * @param context
     * @param file
     * @param view
     * @param width
     * @param height
     */
    public static void into(Context context, File file, ImageView view, int width, int height) {
        DrawableTypeRequest<File> request = Glide.with(context).load(file);
        if (width > 0 && height > 0) {
            request.override(width, height);
        }
        request.placeholder(R.drawable.new_icon_default_img)
                .crossFade()
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }

    /**
     * glide 通过指定的大小从Uri中加载图片
     *
     * @param context
     * @param uri
     * @param view
     * @param width
     * @param height
     */
    public static void into(Context context, Uri uri, ImageView view, int width, int height) {
        DrawableTypeRequest<Uri> request = Glide.with(context).load(uri);
        if (width > 0 && height > 0) {
            request.override(width, height);
        }
        request.placeholder(R.drawable.new_icon_default_img)
                .crossFade()
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }


    /**
     * 高斯模糊图片处理
     *
     * @param context
     * @param url
     * @param view
     */
    public static void intoBlur(Context context, String url, ImageView view) {
        Glide.with(context).load(url)
                .placeholder(R.drawable.new_icon_default_img)
                .crossFade()
                .transform(new BlurTransformation(context))
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }

    /**
     * 圆或者圆角图片处理
     *
     * @param context
     * @param url
     * @param radius 单位dp
     * @param view
     */
    public static void intoRound(Context context, String url, int radius, ImageView view) {
        Glide.with(context).load(url)
                .placeholder(R.drawable.new_person_default_head_icon)
                .crossFade()
                .transform(new RoundTransformation(context, radius))
                .into(view);
    }
    /**
     * 圆或者圆角图片处理
     *
     * @param context
     * @param id
     * @param radius 单位dp
     * @param view
     */
    public static void intoRound(Context context, int id, int radius, ImageView view) {
        Glide.with(context).load(id)
//                .placeholder(R.drawable.new_common_doctor_head)
                .crossFade()
                .transform(new RoundTransformation(context, radius))
                .into(view);
    }


    /**
     * glide 从字符串中加载图片（网络地址或者本地地址）,
     * @param context
     * @param url
     * @param view
     * @param defaultId  默认的失败图片的id
     */
    public static void into(Context context, String url, ImageView view,int defaultId) {
        Glide.with(context).load(url)
                .placeholder(defaultId)
                .crossFade()//淡入淡出
                .centerCrop() // 缩放图片让图片充满整个ImageView的边框，然后裁掉超出的部分
                .into(view);
    }

    /**
     * 从字符串中加载圆形图片（网络地址或者本地地址）,
     * @param context
     * @param url
     * @param radius
     * @param view
     * @param defaultId  默认的失败图片的id
     */
    public static void intoRound(Context context, String url, int radius, ImageView view,int defaultId) {
        Glide.with(context).load(url)
                .placeholder(defaultId)
                .crossFade()
                .transform(new RoundTransformation(context, radius))
                .into(view);
    }
}
