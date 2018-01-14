package com.example.android.newsscrollviewintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showFirstNews(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle extras = new Bundle();

        extras.putString("NewsOneHeading", getString(R.string.first_news_heading));
        extras.putString("NewsBody", getString(R.string.news_body));

        intent.putExtras(extras);
        startActivity(intent);
    }

    public void showSecondNews(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle extras = new Bundle();

        extras.putString("NewsTwoHeading", getString(R.string.second_news_heading));
        extras.putString("NewsBody", getString(R.string.news_body));

        intent.putExtras(extras);
        startActivity(intent);
    }
}
