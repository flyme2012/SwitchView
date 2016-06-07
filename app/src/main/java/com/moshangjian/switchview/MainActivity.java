package com.moshangjian.switchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int[] imageResource = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
            R.drawable.image5, R.drawable.image6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwitchView switchView = (SwitchView) findViewById(R.id.main_switch);

        for (int i = 0; i < 5; i++) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_banner, null, false);
            ImageView imageView = (ImageView) view.findViewById(R.id.item_banner_img);
            imageView.setImageResource(imageResource[i]);
            if (switchView != null){
                switchView.addView(view);
            }
        }
    }
}
