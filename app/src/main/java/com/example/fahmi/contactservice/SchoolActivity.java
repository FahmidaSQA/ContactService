package com.example.fahmi.contactservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SchoolActivity extends AppCompatActivity {

    Button zila;
    Button Coronation;
    Button publicSchool;
    Button bn;
    Button st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);




                zila = (Button) findViewById(R.id.zila);

                zila.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01715686808";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });




                Coronation = (Button) findViewById(R.id.coronation);

                Coronation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-762052";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        publicSchool = (Button) findViewById(R.id.publicSchool);

        publicSchool.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-763692";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

                bn = (Button) findViewById(R.id.bn);

                bn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/" 041-761420";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


                st = (Button) findViewById(R.id.st);

                st.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/" 041-722479";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

            }
        }






