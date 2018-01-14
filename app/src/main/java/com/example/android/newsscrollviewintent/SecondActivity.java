package com.example.android.newsscrollviewintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String mFirstNewsHeading, mSecondNewsHeading, mThirdNewsHeading;
    String mFirstNewsBody, mSecondNewsBody, mThirdNewsBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView newsHeadingTextView = findViewById(R.id.news_heading);
        TextView newsBodyTextView = findViewById(R.id.news_body);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null) {

            if (extras.containsKey(MainActivity.EXTRA_FIRST_NEWS_HEADING) && extras.containsKey(MainActivity.EXTRA_FIRST_NEWS_BODY)) {
                mFirstNewsHeading = extras.getString(MainActivity.EXTRA_FIRST_NEWS_HEADING);
                mFirstNewsBody = extras.getString(MainActivity.EXTRA_FIRST_NEWS_BODY);

                newsHeadingTextView.setText(mFirstNewsHeading);
                newsBodyTextView.setText(mFirstNewsBody);
            }

            if (extras.containsKey(MainActivity.EXTRA_SECOND_NEWS_HEADING) && extras.containsKey(MainActivity.EXTRA_SECOND_NEWS_BODY)) {
                mSecondNewsHeading = extras.getString(MainActivity.EXTRA_SECOND_NEWS_HEADING);
                mSecondNewsBody = extras.getString(MainActivity.EXTRA_SECOND_NEWS_BODY);

                newsHeadingTextView.setText(mSecondNewsHeading);
                newsBodyTextView.setText(mSecondNewsBody);
            }

            if (extras.containsKey(MainActivity.EXTRA_THIRD_NEWS_HEADING) && extras.containsKey(MainActivity.EXTRA_THIRD_NEWS_BODY)) {
                mThirdNewsHeading = extras.getString(MainActivity.EXTRA_THIRD_NEWS_HEADING);
                mThirdNewsBody = extras.getString(MainActivity.EXTRA_THIRD_NEWS_BODY);

                newsHeadingTextView.setText(mThirdNewsHeading);
                newsBodyTextView.setText(mThirdNewsBody);
            }
        }
    }
}
