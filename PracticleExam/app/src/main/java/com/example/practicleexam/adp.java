package com.example.practicleexam;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class adp extends BaseAdapter {

    public int[] img={R.drawable.doublecheesemargherita,R.drawable.pasto,R.drawable.zucchinibellpepperpizza};
    public String[] pname={"Double cheese Margherita","Pasto","Zucchinibell Pepper Pizza"};
    public String[] psize={"large","medium","small"};
    public String[] price={"350","250","150"};
    private Context mcontext;

    public adp(Context c){

        mcontext=c;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgView;

        if(convertView==null)
        {
            imgView=new ImageView(mcontext);
            imgView.setLayoutParams(new GridView.LayoutParams(200,200));
            imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imgView.setPadding(8,8,8,8);

        }
        else
        {
            imgView=(ImageView)convertView;
        }
        imgView.setImageResource(img[position]);


        return imgView;
    }
}
