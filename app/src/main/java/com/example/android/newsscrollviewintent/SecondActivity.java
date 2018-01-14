package com.example.android.newsscrollviewintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mNewsHeading;
    private TextView mNewsBody;

    String mFirstNewsHeading = null;
    String mFirstNewsBody = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mNewsHeading = (TextView) findViewById(R.id.news_heading);
        mNewsBody = (TextView) findViewById(R.id.news_body);

        Intent intent = getIntent();
        Bundle firstNewsExtras = intent.getExtras();


        if (firstNewsExtras != null) {
            mFirstNewsHeading = firstNewsExtras.getString("NewsOneHeading");
            mFirstNewsBody = firstNewsExtras.getString("NewsOneBody");
        }
        mNewsHeading.setText(mFirstNewsHeading);
        mNewsBody.setText(mFirstNewsBody);
    }
}
