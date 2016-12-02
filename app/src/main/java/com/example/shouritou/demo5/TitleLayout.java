package com.example.shouritou.demo5;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by shouritou on 16/11/29.
 */
public class TitleLayout extends LinearLayout{

    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        ImageButton titleBack= (ImageButton) findViewById(R.id.title_back);
        ImageButton titleEdit= (ImageButton) findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();
            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"you clicked Edit Button",Toast.LENGTH_LONG).show();
            }
        });

    }
}
