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
        Bundle firstNewsExtras = new Bundle();

        firstNewsExtras.putString("NewsOneHeading", getString(R.string.first_news_heading));
        firstNewsExtras.putString("NewsOneBody", getString(R.string.first_news_body));

        intent.putExtras(firstNewsExtras);
        startActivity(intent);
    }

    public void showSecondNews(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void showThirdNews(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
