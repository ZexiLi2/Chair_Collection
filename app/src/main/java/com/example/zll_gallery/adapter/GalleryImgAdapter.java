package com.example.zll_gallery.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.zll_gallery.R;

public class GalleryImgAdapter extends BaseAdapter {

    private Context mContext;
    public int[] imgArray = {
            R.drawable.silla01,
            R.drawable.silla02,
            R.drawable.silla03,
            R.drawable.silla04,
            R.drawable.silla05,
            R.drawable.silla6,
            R.drawable.silla07,
            R.drawable.silla08,
            R.drawable.silla09,
            R.drawable.silla10,
            R.drawable.silla11,
            R.drawable.silla12,
            R.drawable.silla13,
            R.drawable.silla14,
            R.drawable.silla15,
            R.drawable.silla16,
            R.drawable.silla17,
            R.drawable.silla18,
            R.drawable.silla19,
            R.drawable.silla20,
            R.drawable.silla21,
            R.drawable.silla22,
            R.drawable.silla23,
            R.drawable.silla24,
            R.drawable.silla25,
            R.drawable.silla26,
            R.drawable.silla27,
            R.drawable.silla28,
            R.drawable.silla29,
            R.drawable.silla30,
            R.drawable.silla31,
            R.drawable.silla32,
            R.drawable.silla33,
            R.drawable.silla34,
            R.drawable.silla35,
            R.drawable.silla36,
            R.drawable.silla37,
            R.drawable.silla38,
            R.drawable.silla39,
            R.drawable.silla40,
            R.drawable.silla41,
            R.drawable.silla42,
            R.drawable.silla43,
            R.drawable.silla44,
            R.drawable.silla45,
            R.drawable.silla46,
            R.drawable.silla47,
            R.drawable.silla48,
            R.drawable.silla49,
            R.drawable.silla50,
            R.drawable.silla51,
            R.drawable.silla52,
            R.drawable.silla53,
            R.drawable.silla54,
            R.drawable.silla55,
            R.drawable.silla56,
            R.drawable.silla57,
            R.drawable.silla58,
            R.drawable.silla59,
            R.drawable.silla60,
    };

    public GalleryImgAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imgArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imgArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imgArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340, 350));

        return imageView;
    }
}
