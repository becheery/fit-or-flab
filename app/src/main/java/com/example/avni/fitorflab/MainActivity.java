package com.example.avni.fitorflab;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE = "excersise.item.title";
    public static final String EXCERSISE_WEIGHT = "Weight lifting";
    public static final String EXCERSISE_YOGA = "Yoga";
    public static final String EXCERSISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout weightBtn = (ConstraintLayout) findViewById(R.id.weightBtn);
        ConstraintLayout yogaBtn = (ConstraintLayout) findViewById(R.id.yogaBtn);
        ConstraintLayout cardioBtn = (ConstraintLayout) findViewById(R.id.cardioBtn);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXCERSISE_WEIGHT);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXCERSISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXCERSISE_CARDIO);
            }
        });
    }

    private void loadDetailActivity(String excersiseTitle) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, excersiseTitle);
        startActivity(intent);
    }
}
