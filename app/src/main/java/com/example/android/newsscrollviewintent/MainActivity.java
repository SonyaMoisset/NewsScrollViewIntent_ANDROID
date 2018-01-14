package com.example.android.newsscrollviewintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_FIRST_NEWS_HEADING = "FirstNewsHeading";
    public static final String EXTRA_SECOND_NEWS_HEADING = "SecondNewsHeading";
    public static final String EXTRA_THIRD_NEWS_HEADING = "ThirdNewsHeading";

    public static final String EXTRA_FIRST_NEWS_BODY = "FirstNewsBody";
    public static final String EXTRA_SECOND_NEWS_BODY = "SecondNewsBody";
    public static final String EXTRA_THIRD_NEWS_BODY = "ThirdNewsBody";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showFirstNews(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle extras = new Bundle();

        extras.putString(EXTRA_FIRST_NEWS_HEADING, getString(R.string.first_news_heading));
        extras.putString(EXTRA_FIRST_NEWS_BODY, getString(R.string.first_news_body));

        intent.putExtras(extras);
        startActivity(intent);
    }

    public void showSecondNews(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle extras = new Bundle();

        extras.putString(EXTRA_SECOND_NEWS_HEADING, getString(R.string.second_news_heading));
        extras.putString(EXTRA_SECOND_NEWS_BODY, getString(R.string.second_news_body));

        intent.putExtras(extras);
        startActivity(intent);
    }

    public void showThirdNews(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle extras = new Bundle();

        extras.putString(EXTRA_THIRD_NEWS_HEADING, getString(R.string.third_news_heading));
        extras.putString(EXTRA_THIRD_NEWS_BODY, getString(R.string.third_news_body));

        intent.putExtras(extras);
        startActivity(intent);
    }
}
