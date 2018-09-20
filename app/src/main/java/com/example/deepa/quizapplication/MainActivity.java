package com.example.deepa.quizapplication;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View V)
                    {
                        Intent myIntent = new Intent(MainActivity.this,Question1.class);
                        startActivity(myIntent);
                    }
                }
        );
    }








}