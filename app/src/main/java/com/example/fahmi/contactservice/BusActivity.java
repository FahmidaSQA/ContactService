package com.example.fahmi.contactservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusActivity extends AppCompatActivity {



    Button sohagParibahan;
    Button egalePori;
    Button hanif;
    Button greeenLine;
    Button tungipara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);


                sohagParibahan = (Button) findViewById(R.id.sohagParibahan);

                sohagParibahan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01191-128701";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


                egalePori = (Button) findViewById(R.id.egalePori);

                egalePori.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-724760";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

                hanif = (Button) findViewById(R.id.hanif);

                hanif.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-410451";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        greeenLine = (Button) findViewById(R.id.greeenLine);

        greeenLine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-813888";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


        tungipara = (Button) findViewById(R.id.tungipara);

        tungipara.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01793-137265";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

            }
        }


