package com.example.jagadeesan.hiphoptamizha;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btnClickEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClickEvent = (Button) findViewById(R.id.button);
        btnClickEvent.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        //Your Logic
        Intent a = new Intent(this, Home.class);
        startActivity(a);
    }
}
