package com.example.avni.fitorflab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView excersiseText = (TextView) findViewById(R.id.excersiseTitle);
        ImageView exceriseImage = (ImageView) findViewById(R.id.excersiseImage);
        LinearLayout mainBG = (LinearLayout) findViewById(R.id.mainBG);

        String excersiseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        excersiseText.setText(excersiseTitle);

        if(excersiseTitle.equalsIgnoreCase(MainActivity.EXCERSISE_WEIGHT)) {
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
            exceriseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight2x));
        } else if(excersiseTitle.equalsIgnoreCase(MainActivity.EXCERSISE_YOGA)) {
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
            exceriseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus2x));
        } else {
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
            exceriseImage.setImageDrawable(getResources().getDrawable(R.drawable.hear2x));
        }

    }
}
