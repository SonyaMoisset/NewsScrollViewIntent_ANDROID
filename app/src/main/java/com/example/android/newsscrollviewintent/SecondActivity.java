package com.example.android.newsscrollviewintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mNewsHeadingTextView;
    private TextView mNewsBodyTextView;

    String mFirstNewsHeading = null;
    String mSecondNewsHeading = null;
    String mThirdNewsHeading = null;
    String mNewsBody = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mNewsHeadingTextView = (TextView) findViewById(R.id.news_heading);
        mNewsBodyTextView = (TextView) findViewById(R.id.news_body);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null) {
            mNewsBody = extras.getString("NewsBody");

            if (extras.containsKey("NewsOneHeading")) {
                mFirstNewsHeading = extras.getString("NewsOneHeading");
                mNewsHeadingTextView.setText(mFirstNewsHeading);
            }

            if (extras.containsKey("NewsTwoHeading")) {
                mSecondNewsHeading = extras.getString("NewsTwoHeading");
                mNewsHeadingTextView.setText(mSecondNewsHeading);
            }

            if (extras.containsKey("NewsThreeHeading")) {
                mThirdNewsHeading = extras.getString("NewsThreeHeading");
                mNewsHeadingTextView.setText(mThirdNewsHeading);
            }
        }

        mNewsBodyTextView.setText(mNewsBody);
    }
}
