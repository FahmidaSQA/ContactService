package com.example.fahmi.contactservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fire extends AppCompatActivity {
    Button khulnaFire;
    Button daulutpurFire;
    Button dumuriaFire;
    Button khalishpurFire;
    Button khanjahanFire;
    Button riverFire;
    Button tutparafire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);



                khulnaFire = (Button) findViewById(R.id.khulnaFire);

                khulnaFire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-760333";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

                daulutpurFire = (Button) findViewById(R.id.daulutpurFire);

                daulutpurFire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-762052";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

                dumuriaFire = (Button) findViewById(R.id.dumuriaFire);

                dumuriaFire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"04025-56144";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


                khalishpurFire = (Button) findViewById(R.id.khalishpurFire);

                khalishpurFire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-761005";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

                khanjahanFire = (Button) findViewById(R.id.khanjahanFire);

                khanjahanFire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01920-236565";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

                riverFire = (Button) findViewById(R.id.riverFire);

                riverFire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-890048";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });
                tutparafire = (Button) findViewById(R.id.tutparafire);

                tutparafire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-723011";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

            }
        }
