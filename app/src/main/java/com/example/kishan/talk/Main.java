package com.example.kishan.talk;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent=new Intent(Main.this,MainActivity.class);
                Main.this.startActivity(mainIntent);
                Main.this.finish();
            }
        },3000);
    }
}
