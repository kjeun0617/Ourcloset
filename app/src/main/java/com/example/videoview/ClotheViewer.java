package com.example.OurCloset;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ClotheViewer extends LayoutInflater {

    TextView textView;
    TextView textView2;
    ImageView imageView;
    public ClotheViewer(Context context) {
        super(context);

        init(context);
    }

    public ClotheViewer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.clotheitem,this,true);

        textView = (TextView) textView.findViewById();
        textView2 = (TextView) textView2.findViewById();
        imageView = (ImageView) imageView.findViewById();
    }

    public void setItem(ClotheItem clotheItem){
        textView.setText(clotheItem.getName());
        textView2.setText(clotheItem.getTel());
        imageView.setImageResource(clotheItem.getImage());
    }
}
