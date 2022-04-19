package com.niyotest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import in.galaxycard.android.GalaxyCard;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, in.galaxycard.android.MainActivity.class);
        startActivity(intent);
    }
}