package com.example.appnotxml;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        root.setBackgroundColor(Color.WHITE);
        root.setOrientation(LinearLayout.VERTICAL);
        setContentView(root);
        //

        ImageView img = new ImageView(this);

        img.setImageResource(R.drawable.android);
        root.addView(img);

        BoxPadrao box1 = new BoxPadrao(this, "Email");
        root.addView(box1);
        BoxPadrao box2 = new BoxPadrao(this, "Senha");
        root.addView(box2);

        Button button = new Button(this);

        button.setText("ADD");

        root.addView(button);

    }
}
