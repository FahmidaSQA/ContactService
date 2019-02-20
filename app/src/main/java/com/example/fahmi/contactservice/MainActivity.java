package com.example.fahmi.contactservice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    public int SPLASH_TIME_OUT = 250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);







            new Handler().postDelayed(new Runnable() {

                @Override

                public void run() {


                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                    startActivity(intent);

                    finish();


                }

            },SPLASH_TIME_OUT);


}
}
