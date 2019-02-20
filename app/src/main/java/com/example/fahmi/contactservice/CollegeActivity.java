package com.example.fahmi.contactservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CollegeActivity extends AppCompatActivity {

    Button sundarban;
    Button city;
    Button publicCollege;
    Button bl;
    Button pioneer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);



                sundarban = (Button) findViewById(R.id.sudarban);

                sundarban.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-721915";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


                city = (Button) findViewById(R.id.city);

                city.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-700678";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

                publicCollege = (Button) findViewById(R.id.publicCollege);

                publicCollege.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"  041-763694";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

                bl = (Button) findViewById(R.id.bl);

                bl.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01811-414391";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


                pioneer = (Button) findViewById(R.id.pioneer);

                pioneer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"0412850083";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

            }
        }

