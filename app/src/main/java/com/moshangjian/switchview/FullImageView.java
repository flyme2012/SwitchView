package com.moshangjian.switchview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

public class FullImageView extends ImageView {
    public FullImageView(Context context) {
        super(context);
    }

    public FullImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FullImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        printMode(widthMode,heightMode);
        setMeasuredDimension(widthSize, heightSize);
    }

    private void printMode(int widthMode , int heightMode){
        if (widthMode == MeasureSpec.AT_MOST){
            Log.d("hb","Width Mode =  AT_MOST");
        }else {
            Log.d("hb","Width Mode =  EXACTLY");
        }
        if (heightMode == MeasureSpec.AT_MOST){
            Log.d("hb","Height Mode =  AT_MOST");
        }else {
            Log.d("hb","Height Mode =  EXACTLY");
        }
    }


}
